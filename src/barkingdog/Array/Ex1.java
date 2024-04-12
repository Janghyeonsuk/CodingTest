package Barkingdog.Array;

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1 {

    public void insertList(int idx, int num, ArrayList<Integer> arr) {
        arr.add(idx, num);
    }

    public void eraseList(int idx, ArrayList<Integer> arr) {
        arr.remove(idx);
    }

    public static void main(String[] args) throws IOException {
        Ex1 main = new Ex1();

        ArrayList<Integer> arr = Stream.of(10, 50, 40, 30, 70, 20).collect(Collectors.toCollection(ArrayList::new));

        main.insertList(3, 60, arr);

        for (Integer i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        main.eraseList(4, arr);


        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}