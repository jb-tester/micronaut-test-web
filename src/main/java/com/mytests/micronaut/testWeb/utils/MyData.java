package com.mytests.micronaut.testWeb.utils;

public class MyData {
    String p1;
    String p2;
    String p3;

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "MyData: " +p1+" "+p2+" "+p3;

    }
}
