package com.mytests.micronaut.testWeb;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.Filter;
import io.micronaut.http.filter.OncePerRequestHttpServerFilter;
import io.micronaut.http.filter.ServerFilterChain;
import org.reactivestreams.Publisher;

import java.util.Map;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/10/2020.
 * Project: micronaut-test-web
 * *******************************
 */
@Filter("/reqattrs1/**")
public class ReqAttrsServerFilter1 extends OncePerRequestHttpServerFilter {
    Map<String, Object> attrs;
    @Override
    protected Publisher<MutableHttpResponse<?>> doFilterOnce(HttpRequest<?> request, ServerFilterChain chain) {
        request.setAttribute("reqAttr1","fooattr");
        request.setAttribute("reqAttr2","barattr");
        attrs = request.getAttributes().asMap();
        System.out.println("**********************************");
        System.out.println("filter works!!!");
        System.out.println("**********************************");
        for (Map.Entry<String, Object> entry : attrs.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        return chain.proceed(request);
    }

    public Map<String, Object> getAttrs() {
        return attrs;
    }
}
