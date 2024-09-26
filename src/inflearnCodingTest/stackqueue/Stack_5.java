package inflearnCodingTest.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Stack_5 {
    // 5. 쇠막대기

    public static int solution(String str) {
        int ans = 0;
        Stack<Character> S = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                S.push('(');
            else {
                S.pop();
                if (str.charAt(i - 1) == '(') {
                    ans += S.size();
                } else {
                    ans++;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }
}
