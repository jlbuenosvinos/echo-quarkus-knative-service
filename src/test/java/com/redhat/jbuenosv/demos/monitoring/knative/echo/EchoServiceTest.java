package com.redhat.jbuenosv.demos.monitoring.knative.echo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by jlbuenosvinos.
 */
@QuarkusTest
public class EchoServiceTest {

    @Inject
    EchoServiceTestUtils echoServiceTestUtils;

    /**
     * Test the echo endpoint injecting a random message
     */
    @Test
    public void testEchoEndpoint() {
        String message = echoServiceTestUtils.randomMessage(16);
        given()
                .request()
                    .body(message)
                .when()
                    .post("/echo")
                .then()
                .statusCode(200)
                .body(is(message));
    }

}
