package com.redhat.jbuenosv.demos.monitoring.knative.echo.application.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.enterprise.context.ApplicationScoped;

/**
 * Created by jlbuenosvinos.
 */
@ApplicationScoped
public class EchoCommandHandler implements  CommandHandler {

    public static final Logger logger = LoggerFactory.getLogger(EchoCommandHandler.class);

    private String message;

    /**
     * Executes a command
     * @param command command to be executed
     */
    @Override
    public void execute(Command command) {
        EchoCommand echoCommand = (EchoCommand)command;
        echoCommand.setOutputMessage(echoCommand.getInputMessage());
        this.message = echoCommand.getOutputMessage();
    }

    public String getMessage() {
        return message;
    }

}
