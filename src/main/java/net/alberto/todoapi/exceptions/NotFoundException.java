package net.alberto.todoapi.exceptions;

import net.alberto.todoapi.enums.InternalErrorCode;

public class NotFoundException extends RuntimeException {
    private InternalErrorCode code;

    public NotFoundException(InternalErrorCode code, String message) {
        super(message);
        this.code = code;
    }

    public InternalErrorCode getCode() {
        return code;
    }
}