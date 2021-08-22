package com.dongwoo.api.customer.stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StreamTest {

    @DisplayName("Stream isEmpty() count")
    @Test
    void streamIsEmptyTest() {
        Stream<String> streams = Stream.of("Apple", "Orange", "");
        int emptyStrings = (int) streams.filter(String::isEmpty).count();
        assertThat(emptyStrings, is(equalTo(1)));
    }
}
