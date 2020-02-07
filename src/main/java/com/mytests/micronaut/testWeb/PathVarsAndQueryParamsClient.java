package com.mytests.micronaut.testWeb;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

@Client("/new")
public interface PathVarsAndQueryParamsClient {

    @Get("/method1/{pvar11}")
    Single<String> method1(@PathVariable("pvar11") String p);

    @Get("/method2/{pvar2}/{pvar3:...[0-9]}")
    Single<String> method2(String pvar2, String pvar3);
}
