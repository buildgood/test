package com.test.incident.exception;

public class NoSuchIncidentExistsException extends RuntimeException {
    private String message;

    public NoSuchIncidentExistsException() {}

    public NoSuchIncidentExistsException(String msg) {
        super(msg);
        this.message = msg;
    }
}
