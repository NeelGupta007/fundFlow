package com.fundflow.authorization.utils.errors;

public class BadRequestException extends RuntimeException {

    public BadRequestException(String messaString) {
        super(messaString);
    }
}
