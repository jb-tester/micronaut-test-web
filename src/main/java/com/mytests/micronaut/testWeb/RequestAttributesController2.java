package com.mytests.micronaut.testWeb;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.RequestAttribute;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/10/2020.
 * Project: micronaut-test-web
 * *******************************
 */
@Controller("/reqattrs2")
public class RequestAttributesController2 {



    @Get(value = "/test2")
    public String testReqAttrs2(){

       return "reqattrs2";

    }

}
