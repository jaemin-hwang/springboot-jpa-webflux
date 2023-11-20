package com.luke.app.api.auth.exception;

import com.luke.app.api.common.exception.ErrorMessageCode;
import com.luke.app.api.common.exception.LukeException;
import org.springframework.http.HttpStatus;

public class RoleNotFoundException extends LukeException {


    public RoleNotFoundException() {
        super("RoleNotFoundException", ErrorMessageCode.ROLE_NOT_FOUND);
    }

    public RoleNotFoundException(String message) {
        super(message);
    }

    public RoleNotFoundException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);

    }

    public RoleNotFoundException(String message, HttpStatus httpStatus, ErrorMessageCode errorMessagerCode) {
        super(message, httpStatus, errorMessagerCode);
    }

    public RoleNotFoundException(String message, ErrorMessageCode errorMessagerCode) {
        super(message, errorMessagerCode);
    }

    public RoleNotFoundException(ErrorMessageCode errorMessagerCode) {
        super(errorMessagerCode);

    }

}
