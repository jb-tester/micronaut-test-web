package com.mytests.micronaut.testWeb;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/10/2020.
 * Project: micronaut-test-web
 * *******************************
 */

@MicronautTest
class ReqAttrsClientTest {
    @Inject
    ReqAttrsClient client;
    @Inject
    ReqAttrsClientFilter2 filter;
    @Test
    void testReqAttr2() {
        assertEquals("reqattrs2", client.testReqAttr2().blockingGet());
        Map<String, Object> attrs = filter.getAttrs();
        for (Map.Entry<String, Object> entry : attrs.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        assertEquals(filter.attr3,"boo");
        assertEquals(filter.attr4,"100");
    }
}
