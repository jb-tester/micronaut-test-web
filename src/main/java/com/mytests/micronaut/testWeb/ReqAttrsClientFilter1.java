package com.mytests.micronaut.testWeb;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.annotation.Filter;
import io.micronaut.http.filter.ClientFilterChain;
import io.micronaut.http.filter.HttpClientFilter;
import org.reactivestreams.Publisher;

import java.util.Map;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/10/2020.
 * Project: micronaut-test-web
 * *******************************
 */
@Filter("/reqattrs1/**")
public class ReqAttrsClientFilter1 implements HttpClientFilter {
    Map<String, Object> attrs;
    @Override
    public Publisher<? extends HttpResponse<?>> doFilter(MutableHttpRequest<?> request, ClientFilterChain chain) {
        System.out.println("**********************************");
        System.out.println("client filter works!");
        System.out.println("**********************************");;
        attrs = request.getAttributes().asMap();
        for (Map.Entry<String, Object> entry : attrs.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        return chain.proceed(request);
    }
    public Map<String, Object> getAttrs() {
        return attrs;
    }
}
