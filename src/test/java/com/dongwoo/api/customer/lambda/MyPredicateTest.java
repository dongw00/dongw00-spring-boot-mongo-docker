package com.dongwoo.api.customer.lambda;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import org.junit.jupiter.api.Test;

class MyPredicateTest {

    @Test
    void test1() {
        List<String> list = new ArrayList<>();

        list.add("Bithumb");
        list.add("");
        list.add("Kakaotalk");
        list.add("");
        list.add("Bitcamp");

        Predicate<String> predicate = s -> !s.isEmpty();

        List<String> newList = filterList(list, predicate);
        assertThat(newList, is(equalTo(Arrays.asList("Bithumb", "Kakaotalk", "Bitcamp"))));

        Predicate<String> filter = s -> s.contains("talk");
        List<String> newList2 = filterList(list, filter);
        assertThat(newList2, is(equalTo(Collections.singletonList("Kakaotalk"))));
    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();

        for (T str : list) {
            if (predicate.test(str)) {
                newList.add(str);
            }
        }

        return newList;
    }
}