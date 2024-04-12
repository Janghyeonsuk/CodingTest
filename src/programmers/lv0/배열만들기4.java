package programmers.lv0;

import java.util.Stack;

public class 배열만들기4 {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            if (stack.empty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else if (stack.peek() >= arr[i]) {
                stack.pop();
            }
        }
        return stack;
    }
}
