package com.dongwoo.api.customer.lambda;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

class MySupplierTest {

    @Test
    void main() {
        Supplier<String> stringSupplier = () -> new String("No pain, No Gain");
        assertThat(stringSupplier.get(), is(equalTo("No pain, No Gain")));
    }
}