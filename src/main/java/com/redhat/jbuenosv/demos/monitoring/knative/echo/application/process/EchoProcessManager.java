package com.redhat.jbuenosv.demos.monitoring.knative.echo.application.process;

/**
 * Created by jlbuenosvinos.
 */
public interface EchoProcessManager {

    /**
     * Echo a message
     * @param message
     */
    void echo(String message);

}
