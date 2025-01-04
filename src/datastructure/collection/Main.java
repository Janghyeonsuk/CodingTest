package datastructure.collection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int s = new MyCollection<>(Arrays.asList("A", "CA", "DSB", "ASDC", "ASDFE"))
                .map(String::length)
                .filter(i -> i % 2 == 1)
                .size();

        System.out.println(s);
    }
}
