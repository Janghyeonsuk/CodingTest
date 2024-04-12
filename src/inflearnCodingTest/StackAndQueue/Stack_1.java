package inflearnCodingTest.StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Stack_1 {
    // 1. 올바른 괄호
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '(')
                stack.push(x);
            else {
                if (stack.empty())
                    return "NO";
                stack.pop();
            }
        }

        if (!stack.empty())
            return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Stack_1 main = new Stack_1();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(main.solution(str));
    }

}
