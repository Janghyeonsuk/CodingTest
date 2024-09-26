package inflearnCodingTest.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Stack_1 {
    // 1. 올바른 괄호
    public static String solution(String str) {
        Stack<Character> S = new Stack<>();

        for (char x : str.toCharArray()) {
            if(x == '('){
                S.push(x);
            } else{
                if(S.isEmpty()) {
                    return "NO";
                } else
                    S.pop();
            }
        }
        if(S.isEmpty())
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }

}
