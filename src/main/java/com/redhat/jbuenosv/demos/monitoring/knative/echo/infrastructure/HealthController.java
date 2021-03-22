package com.redhat.jbuenosv.demos.monitoring.knative.echo.infrastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by jlbuenosvinos.
 */
@Path("/api")
public class HealthController {

    public static final Logger logger = LoggerFactory.getLogger(HealthController.class);

    /**
     * Default constructor
     */
    public HealthController() {
    }

    /**
     * health signal
     * @return HTTP 200 CODE
     */
    @GET
    @Path("/health")
    public Response health() {
       return Response.ok().build();
    }

}
