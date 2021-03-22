package com.redhat.jbuenosv.demos.monitoring.knative.echo.application.command;

/**
 * Created by jlbuenosvinos.
 */
public interface CommandHandler {

    /**
     * Executes a command
     * @param command
     */
    void execute(Command command) ;

}
