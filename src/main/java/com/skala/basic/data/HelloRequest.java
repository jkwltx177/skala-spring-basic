package com.skala.basic.data;

public class HelloRequest {
    private String hello;

    public HelloRequest() {
    }

    public HelloRequest(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
