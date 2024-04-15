package baekjoon.structure.stack;

import java.io.*;
import java.util.*;

public class BOJ10799 {
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                stack.push('(');
            else {
                stack.pop();
                if (str.charAt(i - 1) == '(')
                    answer += stack.size();
                else
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BOJ10799 T = new BOJ10799();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}

