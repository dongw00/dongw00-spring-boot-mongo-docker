package com.dongwoo.api.customer.lambda;

@FunctionalInterface
public interface MyUnaryOp {

    int operator(int a);
}
