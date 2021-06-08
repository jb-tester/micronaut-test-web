package com.mytests.micronaut.testWeb;

import io.micronaut.http.annotation.Controller;


@Controller("/inherited_test")
public class ParentControllerImpl implements ParentControllerInterface {

    // https://youtrack.jetbrains.com/issue/IDEA-271104 - no requests are generated for this method
    @Override
    public String method1() {
        return "inherited method1";
    }

    // https://youtrack.jetbrains.com/issue/IDEA-271104 - incorrect request is generated
    @Override
    public String method2() {
        return "inherited method2";
    }

    // https://youtrack.jetbrains.com/issue/IDEA-271114 - detect not matching path variable here
    @Override
    public String methodWithPathVars(String pv) {
        return "inherited methodWithPathVars(" + pv + ")";
    }
}
