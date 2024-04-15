package baekjoon.structure.stack;

import java.io.*;
import java.util.*;

public class num_10799 {
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
        num_10799 T = new num_10799();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}

