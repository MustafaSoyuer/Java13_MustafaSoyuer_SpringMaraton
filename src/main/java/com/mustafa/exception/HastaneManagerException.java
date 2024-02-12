package com.mustafa.exception;

import lombok.Getter;

@Getter
public class HastaneManagerException extends RuntimeException{

    private final ErrorType errorType;
    public HastaneManagerException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public HastaneManagerException(ErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }

}
