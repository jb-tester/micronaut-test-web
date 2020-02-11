package com.mytests.micronaut.testWeb;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.RequestAttribute;
import io.micronaut.http.annotation.RequestAttributes;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/10/2020.
 * Project: micronaut-test-web
 * *******************************
 */

@RequestAttributes({
        @RequestAttribute(name = "reqAttr3", value = "boo"),
        @RequestAttribute(name = "reqAttr4", value = "100")
})
@Client("/reqattrs2")
public interface ReqAttrsClient2 {

    @Get("/test2")
    Single<String> testReqAttr2();
}
