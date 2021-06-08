package com.mytests.micronaut.testWeb;


import io.micronaut.http.annotation.Get;

// https://youtrack.jetbrains.com/issue/IDEA-271108 - incorrect inlay action results
public interface ParentControllerInterface {

    @Get
    String method1();

    @Get("/m2")
    String method2();

    @Get("/m3/{code}")
    String methodWithPathVars(String code);

}
