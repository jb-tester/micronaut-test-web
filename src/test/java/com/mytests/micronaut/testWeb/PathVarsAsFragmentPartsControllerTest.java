package com.mytests.micronaut.testWeb;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;
@MicronautTest(packages = "com.mytests.micronaut.testWeb", application = Application.class)
class PathVarsAsFragmentPartsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void method1() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/pathvars/method1/foo"));
        assertEquals("method1 foo", response);
    }

    @Test
    void method2() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/pathvars/method2/test3"));
        assertEquals("method2 test3", response);
    }

    @Test
    void method3() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/pathvars/method3/3test"));
        assertEquals("method3 test3", response);
    }

    @Test
    void method4() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/pathvars/method4/test7atest"));
        assertEquals("method4 test7a", response);
    }
}
