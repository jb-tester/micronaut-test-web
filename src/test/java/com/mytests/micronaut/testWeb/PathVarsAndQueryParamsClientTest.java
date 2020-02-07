package com.mytests.micronaut.testWeb;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/16/2019.
 * Project: hello-world
 * *******************************
 */
@MicronautTest
class PathVarsAndQueryParamsClientTest {
 @Inject
 PathVarsAndQueryParamsClient client;

    @Test
    void testMethod1Client() {
        assertEquals("method1 bar9", client.method1("bar9").blockingGet());
    }
    @Test
    void testMethod2Client() {
        assertEquals("method2 foo bar7", client.method2("foo","bar7").blockingGet());
    }
}
