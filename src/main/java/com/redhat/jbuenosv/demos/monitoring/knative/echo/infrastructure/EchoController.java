package com.redhat.jbuenosv.demos.monitoring.knative.echo.infrastructure;

import com.redhat.jbuenosv.demos.monitoring.knative.echo.application.exception.EchoApplicationException;
import com.redhat.jbuenosv.demos.monitoring.knative.echo.application.process.EchoProcessManagerImpl;
import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by jlbuenosvinos.
 */
@Path("/echo")
public class EchoController {

    public static final Logger logger = LoggerFactory.getLogger(EchoController.class);

    @Inject
    private EchoProcessManagerImpl echoProcessManager;

    public EchoController() {
    }

    @Counted(name = "countEcho", description = "Counts how many times the echo method has been invoked")
    @Timed(name = "timeEcho", description = "Times how long it takes to invoke the echo method", unit = MetricUnits.MILLISECONDS)
    @POST
    public Response echo(String message) {
        Response echoResponse;
        String outPutMessage;

        try {
            logger.debug("Message [{}] to be echoed.", message);
            outPutMessage = echoProcessManager.echo(message);
            echoResponse = Response.ok(outPutMessage).build();
        }
        catch(EchoApplicationException e) {
            echoResponse = Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
            logger.debug("Error processing the message [{}] due to [{}]",message,e.getMessage());
        }

        return echoResponse;
    }

}
