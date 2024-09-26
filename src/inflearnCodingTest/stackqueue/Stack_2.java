package inflearnCodingTest.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Stack_2 {
    // 2. 괄호 문자 제거
    public String solution(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') ;
            } else
                stack.push(x);
        }

        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }

//        Stack<Character> S = new Stack<>();
//        for (char x : str.toCharArray()) {
//            if (x == '(') {
//                S.push(x);
//            } else if (x == ')') {
//                if (!S.isEmpty())
//                    S.pop();
//            } else {
//                if (S.isEmpty())
//                    sb.append(x);
//            }
//        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Stack_2 main = new Stack_2();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(main.solution(str));
    }
}
