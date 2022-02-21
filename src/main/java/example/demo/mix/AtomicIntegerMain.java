package example.demo.mix;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerMain {
    public static void main(String[] args) {
        AtomicInteger number = new AtomicInteger();
        System.out.println("Number 1 ::"+number);
        System.out.println(number.incrementAndGet());
        int num =number.getAndIncrement();
        System.out.println("Number 2 ::"+number.getAndIncrement());
        System.out.println("Number 3 ::"+number.getAndIncrement());
        System.out.println("Number 4 ::"+num);

        System.out.println("Number 1 ::"+number);
        num =number.incrementAndGet();
        System.out.println("Number 5 ::"+num);
        System.out.println(number.get());
    }
}
