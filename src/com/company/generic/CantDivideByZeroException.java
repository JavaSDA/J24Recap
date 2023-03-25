package com.company.generic;

public class CantDivideByZeroException extends RuntimeException {
    public CantDivideByZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
