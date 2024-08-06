package com.msg.edc.extension.ccp.exception;

public class CcpException extends Exception {
    public CcpException(String message) {
        super(message);
    }

    public CcpException(String message, Throwable cause) {
        super(message, cause);
    }
}
