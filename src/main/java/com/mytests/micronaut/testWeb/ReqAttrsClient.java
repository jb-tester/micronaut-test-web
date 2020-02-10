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
// todo: doesn't work!!! investigate and correct
@Client("/reqattrs1")
@RequestAttributes({
        @RequestAttribute(name = "reqAttr3", value = "boo"),
        @RequestAttribute(name = "reqAttr4", value = "100")
})
public interface ReqAttrsClient {

    @Get("/test2")
    Single<String> testReqAttr2();
}
