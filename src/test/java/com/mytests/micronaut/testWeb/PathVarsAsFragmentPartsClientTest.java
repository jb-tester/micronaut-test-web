package com.mytests.micronaut.testWeb;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
public class PathVarsAsFragmentPartsClientTest {

    @Inject
    PathVarsAsFragmentPartsClient client;

    @Test
    void method1() {
        assertEquals("method1 foo", client.method1("foo").blockingGet());
    }

    @Test
    void method2() {
        assertEquals("method2 test7", client.method2(7).blockingGet());
    }

    @Test
    void method3() {
        assertEquals("method3 test7", client.method3(7).blockingGet());
    }

    @Test
    void method4() {
        assertEquals("method4 test7c", client.method4(7,"c").blockingGet());
    }
}
