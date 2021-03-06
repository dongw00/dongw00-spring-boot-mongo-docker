package com.dongwoo.api.customer.lambda;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.Test;

class MyFunctionTest {

    @Test
    void main() {
        List<String> list = Arrays.asList("Bithumb", "Company", "Market");
        Function<String, Integer> function = String::length;
        List<Integer> newList = map(list, function);
        assertThat(newList.get(1), is(equalTo(7)));
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> newList = new ArrayList<>();
        for (T e : list) {
            newList.add(function.apply(e));
            System.out.println(newList.get(newList.size() - 1));
        }
        return newList;
    }
}