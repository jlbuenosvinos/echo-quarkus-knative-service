package com.redhat.jbuenosv.demos.monitoring.knative.echo.application.process;

import com.redhat.jbuenosv.demos.monitoring.knative.echo.application.command.EchoCommand;
import com.redhat.jbuenosv.demos.monitoring.knative.echo.application.command.EchoCommandHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * Created by jlbuenosvinos.
 */
@ApplicationScoped
public class EchoProcessManagerImpl {

    public static final Logger logger = LoggerFactory.getLogger(EchoProcessManagerImpl.class);

    @Inject
    EchoCommandHandler echoCommandHandler;

    @Inject
    EchoCommand echoCommand;

    /**
     * Echo a message
     * @param message message
     * @return echo message
     */
    public String echo(String message) {
        echoCommand.setInputMessage(message);
        echoCommandHandler.execute(echoCommand);
        return echoCommandHandler.getMessage();
    }

}
