package com.mytests.micronaut.testWeb;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import javax.annotation.Nullable;

@Controller("/pathvars")
public class PathVarsAsFragmentPartsController {

    // method with optional path fragment:
    @Get(value = "/method1{/pvar1:3}")
    public String method1(@Nullable @PathVariable("pvar1") String pv){
        return "method1 "+pv;
    }

    // method with path variable as a fragment suffix
    @Get(value = "/method2/test{pvar2:[0-9]}")
    public String method2(@PathVariable("pvar2") int pv){

        return "method2 test"+pv;
    }
    // method with path variable as a fragment prefix
    @Get(value = "/method3/{pvar3:[0-9]}test")
    public String method3(@PathVariable("pvar3") int pv){

        return "method3 test"+pv;
    }
    // method with path variable in a middle of a fragment
    @Get(value = "/method4/test{pvar4:[0-9]}{pvar5:[a-z]}test")
    public String method4(@PathVariable("pvar5") String pv2, @PathVariable("pvar4") int pv1){

        return "method4 test"+pv1+pv2;
    }
}
