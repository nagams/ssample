package com.dipendit.ssample.common;

public class Foo1 {

    private String foo;

    public Foo1() {
    }

    public Foo1(String foo) {
        this.foo = foo;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    @Override
    public String toString() {
        return "Foo1{" +
                "foo='" + foo + '\'' +
                '}';
    }
}
