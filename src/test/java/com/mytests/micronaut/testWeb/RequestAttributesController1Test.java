package com.mytests.micronaut.testWeb;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/10/2020.
 * Project: micronaut-test-web
 * *******************************
 */
@MicronautTest
class RequestAttributesController1Test {
    @Inject
    EmbeddedServer server;

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void testReqAttrs() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/reqattrs1/test/2000"));

        assertEquals("reqattrs1 test: fooattr barattr 2000 1000", response);
    }
}
