package example.hackerrank;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.stream.Collectors.toList;
/*
* There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example


There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

int n: the number of socks in the pile
int ar[n]: the colors of each sock
Returns

int: the number of pairs
* */
public class SalesByMatch {
    public static void main(String[] args) throws IOException {
        List<Integer> ar = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int i = sockMerchant(9, ar);
        System.out.println("-------- "+i);
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        AtomicInteger pairs = new AtomicInteger();
        ar.stream().distinct().forEach(e -> {
            List<Integer> sameColourSocks = ar.stream().filter(f -> f == e).collect(toList());
            pairs.set(pairs.get() + sameColourSocks.size() / 2);
        });
        return pairs.get();
    }
}
