package com.dongwoo.api.customer.lambda;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyInterfaceTest {

    @DisplayName("Imperative vs Declarative")
    @BeforeEach
    void setUp() {
    }

    @DisplayName("0부터 100까지의 합")
    @Test
    void sumFrom0To100Test() {
        // Imperative
        int sumOfEvens = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEvens += i;
            }
        }

        System.out.println("Imperative: " + sumOfEvens);

        sumOfEvens = IntStream.rangeClosed(0, 100)
            .filter(i -> i % 2 == 0)
            .reduce(Integer::sum)
            .getAsInt();

        System.out.println("Declarative: " + sumOfEvens);
    }

    static String myFunction(MyInterface func) {return func.myMethod();}
    @DisplayName("Functional Interface")
    @Test
    void myMethod() {
        assertThat(myFunction(()->"Hello Functional Interface"),
            is(equalTo("Hello Functional Interface")));
    }
}