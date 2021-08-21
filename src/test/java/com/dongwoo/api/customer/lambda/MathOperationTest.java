package com.dongwoo.api.customer.lambda;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathOperationTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void main() {
        MathOperation plus = Integer::sum;
        MathOperation times = (a, b) -> a * b;

        assertThat(plus.main(3, 5), is(equalTo(8)));
        assertThat(times.main(3, 5), is(equalTo(15)));
    }
}