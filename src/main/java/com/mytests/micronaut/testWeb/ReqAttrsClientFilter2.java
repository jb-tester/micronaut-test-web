package com.mytests.micronaut.testWeb;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.annotation.Filter;
import io.micronaut.http.filter.ClientFilterChain;
import io.micronaut.http.filter.HttpClientFilter;
import org.reactivestreams.Publisher;

import java.util.HashMap;
import java.util.Map;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/10/2020.
 * Project: micronaut-test-web
 * *******************************
 */
@Filter("/reqattrs2/** ")
public class ReqAttrsClientFilter2 implements HttpClientFilter {

    Map<String, Object> attrs;
    String attr3;
    String attr4;
    @Override
    public Publisher<? extends HttpResponse<?>> doFilter(MutableHttpRequest<?> request, ClientFilterChain chain) {
        System.out.println("**********************************");
        System.out.println("client filter works!");
        System.out.println(request.getUri());
        attrs = request.getAttributes().asMap();
        attr3 = (String) request.getAttribute("reqAttr3").get();
        attr4 = (String) request.getAttribute("reqAttr4").get();
        System.out.println("**********************************");
        return chain.proceed(request);
    }
    public Map<String, Object> getAttrs() {
        return attrs;
    }

    public String getAttr3() {
        return attr3;
    }

    public String getAttr4() {
        return attr4;
    }
}
