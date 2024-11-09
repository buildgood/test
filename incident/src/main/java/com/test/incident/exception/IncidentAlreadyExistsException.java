package com.test.incident.exception;

public class IncidentAlreadyExistsException extends RuntimeException {
    private String message;

    public IncidentAlreadyExistsException() {}

    public IncidentAlreadyExistsException(String msg) {
        super(msg);
        this.message = msg;
    }
}
