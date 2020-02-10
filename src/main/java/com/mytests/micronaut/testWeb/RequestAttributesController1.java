package com.mytests.micronaut.testWeb;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.RequestAttribute;

import javax.annotation.Nullable;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/10/2020.
 * Project: micronaut-test-web
 * *******************************
 */
@Controller("/reqattrs1")
public class RequestAttributesController1 {

    @Get(value = "/test/{reqAttr0}")
    public String testReqAttrs(@RequestAttribute("reqAttr1") String attr1,
                               @RequestAttribute String reqAttr2,
                               @RequestAttribute(value = "reqAttr0") String reqAttr0,
                               @RequestAttribute(defaultValue = "1000") String reqAttr00
    ){

        return "reqattrs1 test: "+attr1+" "+reqAttr2+" "+reqAttr0+" "+reqAttr00;
    }

    @Get(value = "/test2")
    public String testReqAttrs2(@RequestAttribute(value = "reqAttr3") String attr3,
                                @RequestAttribute String reqAttr4 ){

        return "reqattrs1 test2: "+attr3+" "+reqAttr4;
    }

}
