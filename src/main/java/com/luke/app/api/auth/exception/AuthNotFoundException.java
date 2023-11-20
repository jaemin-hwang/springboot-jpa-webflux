package com.luke.app.api.auth.exception;

import com.luke.app.api.common.exception.ErrorMessageCode;
import com.luke.app.api.common.exception.LukeException;
import org.springframework.http.HttpStatus;

public class AuthNotFoundException extends LukeException {


    public AuthNotFoundException() {
        super("AuthNotFoundException", ErrorMessageCode.AUTH_NOT_FOUND);
    }

    public AuthNotFoundException(String message) {
        super(message);
    }

    public AuthNotFoundException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);

    }

    public AuthNotFoundException(String message, HttpStatus httpStatus, ErrorMessageCode errorMessagerCode) {
        super(message, httpStatus, errorMessagerCode);
    }

    public AuthNotFoundException(String message, ErrorMessageCode errorMessagerCode) {
        super(message, errorMessagerCode);
    }

    public AuthNotFoundException(ErrorMessageCode errorMessagerCode) {
        super(errorMessagerCode);

    }

}
