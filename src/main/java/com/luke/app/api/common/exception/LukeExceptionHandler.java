package com.luke.app.api.common.exception;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebExceptionHandler;
import reactor.core.publisher.Mono;

@Component
@Order(-2)
@Slf4j
public class LukeExceptionHandler implements WebExceptionHandler {

    private ObjectMapper objectMapper;

    public LukeExceptionHandler(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public Mono<Void> handle(ServerWebExchange exchange, Throwable ex) {
        exchange.getResponse().getHeaders().setContentType(MediaType.APPLICATION_JSON);
        exchange.getResponse().getHeaders().setAccessControlAllowOrigin("*");
        if (ex instanceof LukeException) {
            LukeException lukeException = (LukeException) ex;

            exchange.getResponse().setStatusCode(lukeException.getHttpStatus());
            LukeErrors errors = new LukeErrors(lukeException.getErrorMessagerCode().getCode(), lukeException.getErrorMessagerCode().getResponseValue());
            if (lukeException.getErrors() != null) {
                if (lukeException.getErrors().size() > 0) {
                    lukeException.getErrors().forEach(e -> errors.add(e.getPath(), e.getCode(), e.getMessage()));
                }
            }

            try {
                DataBuffer db = new DefaultDataBufferFactory().wrap(objectMapper.writeValueAsBytes(errors));
                return exchange.getResponse().writeWith(Mono.just(db));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                return Mono.empty();
            }
        } else if (ex instanceof BadCredentialsException) {
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);

            return exchange.getResponse().setComplete();
        }

        return Mono.error(ex);
    }
}
