package com.redhat.jbuenosv.demos.monitoring.knative.echo.application.exception;

/**
 * Created by jlbuenosvinos
 */
public class EchoApplicationException extends RuntimeException {

    public EchoApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public EchoApplicationException(String message) {
        super(message);
    }

    public EchoApplicationException(Throwable cause) {
        super(cause);
    }

}