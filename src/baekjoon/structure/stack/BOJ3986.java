package baekjoon.structure.stack;

import java.io.*;
import java.util.*;

public class BOJ3986 {
    public int solution(String str) {
        Stack<Character> stack = new Stack<>();
        if (str.length() % 2 == 1)
            return 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (stack.empty())
                stack.push(ch);
            else {
                if (ch == stack.peek())
                    stack.pop();
                else
                    stack.push(ch);
            }
        }
        return stack.empty() ? 1 : 0;
    }

    public static void main(String[] args) throws IOException {
        BOJ3986 T = new BOJ3986();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < N; i++)
            answer += T.solution(br.readLine());

        System.out.println(answer);
    }
}
