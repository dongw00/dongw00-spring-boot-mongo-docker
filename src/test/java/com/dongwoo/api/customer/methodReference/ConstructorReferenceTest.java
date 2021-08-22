package com.dongwoo.api.customer.methodReference;

import java.util.function.Function;
import org.junit.jupiter.api.Test;


class ConstructorReferenceTest {

    @Test
    void main() {
        Function<Runnable, Thread> threadGenerator = Thread::new;
        Runnable t1 = () -> System.out.println("t1 execute");
        Runnable t2 = () -> System.out.println("t2 execute");

        Thread thead1 = threadGenerator.apply(t1);
        Thread thead2 = threadGenerator.apply(t2);

        thead1.start();
        thead2.start();

        threadGenerator
            .apply(() -> System.out.println("t3 execute"))
            .start();
    }
}