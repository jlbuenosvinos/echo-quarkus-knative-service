package com.redhat.jbuenosv.demos.monitoring.knative.echo.application.command;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by jlbuenosvinos.
 */
@ApplicationScoped
public class EchoCommand implements Command {

    private String inputMessage;
    private String outputMessage;

    public EchoCommand() {
    }

    public String getInputMessage() {
        return inputMessage;
    }

    public void setInputMessage(String inputMessage) {
        this.inputMessage = inputMessage;
    }

    public String getOutputMessage() {
        return outputMessage;
    }

    public void setOutputMessage(String outputMessage) {
        this.outputMessage = outputMessage;
    }

}
