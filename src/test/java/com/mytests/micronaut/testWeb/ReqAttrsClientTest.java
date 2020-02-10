package com.mytests.micronaut.testWeb;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/10/2020.
 * Project: micronaut-test-web
 * *******************************
 */
// todo: doesn't work!!! investigate and correct
@MicronautTest
class ReqAttrsClientTest {
    @Inject
    ReqAttrsClient client;
    @Inject
    ReqAttrsClientFilter1 filter;
    @Test
    void testReqAttr2() {
        /*EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer.class);
        ReqAttrsClient client = embeddedServer.getApplicationContext().getBean(ReqAttrsClient.class);
        ReqAttrsServerFilter1 filter = embeddedServer.getApplicationContext().getBean(ReqAttrsServerFilter1.class);*/
        /*Map<String, Object> attrs = filter.getAttrs();
        for (Map.Entry<String, Object> entry : attrs.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/
        assertEquals("", client.testReqAttr2().blockingGet());
    }
}
