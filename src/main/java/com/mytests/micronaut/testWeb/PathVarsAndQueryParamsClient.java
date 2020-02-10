package com.mytests.micronaut.testWeb;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;
import io.reactivex.annotations.Nullable;
 /** todo: is it ok that methods are shown as unused until they are used in test? **/
@Client("/pathvars")
public interface PathVarsAndQueryParamsClient {

    @Get(uri = "/method1/{pvar11:foo[0-9]|bar[0-9]}")
    Single<String> method1(@PathVariable("pvar11") String p);

    @Get(value="/method2/{pvar2}/{pvar3:...[0-9]}")
    Single<String> method2(@PathVariable String pvar2, @PathVariable String pvar3);

    @Get(uri = "/method3{/pvar4:3}")
    Single<String> method3(@Nullable @PathVariable() String pvar4 );

    @Get("/method4/{+pvar5}{?p1,p2}")
    Single<String> method4(@PathVariable("pvar5") String pv5, @javax.annotation.Nullable @QueryValue String p1,
                           @javax.annotation.Nullable @QueryValue("p2") String param2);


}
