package com.dongwoo.api.customer.lambda;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class MyConsumerTest {

    @Test
    void main() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(56);
        // printElement(list, consumer);
    }

    private static <T> void printElement(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}