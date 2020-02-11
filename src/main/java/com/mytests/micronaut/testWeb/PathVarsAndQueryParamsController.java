package com.mytests.micronaut.testWeb;

import com.mytests.micronaut.testWeb.utils.MyData;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.QueryValue;

import javax.annotation.Nullable;

@Controller("/pathvars")
public class PathVarsAndQueryParamsController {

    @Get("/method1/{pvar1:foo[0-9]|bar[0-9]}")
    public String method1(@PathVariable("pvar1") String p){

        return "method1 "+p;
    }

    @Get("/method2/{pvar2}/{pvar3:...[0-9]}")
    public String method2(@PathVariable String pvar2, @PathVariable("pvar3") String pvar3){

        return "method2 "+pvar2+" "+pvar3;
    }
    @Get(value = "/method3{/pvar4:3}")
    public String method3(@Nullable @PathVariable("pvar4") String pvar4){
        return "method3 "+pvar4;
    }

    @Get(value = "/method4/{+pvar5}{?p1,p2}")
    public String method4(@PathVariable("pvar5") String pv5, @Nullable @QueryValue String p1,
                          @Nullable @QueryValue("p2") String param2){
        return "method4 "+pv5+" "+p1+" "+param2;
    }

    @Get(value = "/method5/{pvar6}{?mydata*}")
    public String method5(@PathVariable("pvar6") String pvar6, @Nullable MyData mydata){
        return "method5 "+mydata.toString();
    }

    @Get(value = "/method6/test{pvar6:[0-9]}{pvar7:[a-z]}test")
    public String method6(@PathVariable("pvar7") String opv, @PathVariable("pvar6") int pv){

        return "method6 test"+pv+opv;
    }
}
