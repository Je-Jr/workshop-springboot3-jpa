package com.jejr.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final Long serialVersionIUD = 1L;
    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
