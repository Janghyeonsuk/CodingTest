package Baekjoon.심화1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class num_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();

        ArrayList<String> cro = new ArrayList<>(
                List.of("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="));

        for (String ch : cro)
            str = str.replace(ch, "A");

        System.out.println(str.length());
    }
}