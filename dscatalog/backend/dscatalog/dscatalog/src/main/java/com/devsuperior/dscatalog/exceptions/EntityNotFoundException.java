package com.devsuperior.dscatalog.exceptions;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(String msg) {
        super(msg);
    }
}
