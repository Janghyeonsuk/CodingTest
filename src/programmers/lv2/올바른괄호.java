package programmers.lv2;

import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '('){
                stack.push('(');
            } else {
                if(stack.empty())
                    return false;
                stack.pop();
            }
        }
        return stack.empty();
    }
}
