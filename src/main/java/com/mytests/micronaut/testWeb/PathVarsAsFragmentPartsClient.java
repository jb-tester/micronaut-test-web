package com.mytests.micronaut.testWeb;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

import javax.annotation.Nullable;

@Client("/pathvars_as_fragments")
public interface PathVarsAsFragmentPartsClient {

    @Get(value = "/method1{/pvar1:3}")
    Single<String> method1(@Nullable @PathVariable("pvar1") String p1);

    @Get(value = "/method2/test{pvar2:[0-9]}")
    Single<String> method2(@PathVariable("pvar2")int p1);

    @Get(value = "/method3/{pvar3:[0-9]}test")
    Single<String> method3(@PathVariable("pvar3")int p1);

    @Get(value = "/method4/test{pvar4:[0-9]}{pvar5:[a-z]}test")
    Single<String> method4(@PathVariable("pvar4")int p1, @PathVariable("pvar5")String p2);
}
