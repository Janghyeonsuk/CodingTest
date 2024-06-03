package inflearnCodingTest.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Stack_4 {
    // 4. 후위 연산식 계산

    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x))
                stack.push(x - 48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();

                if (x == '+')
                    stack.push(lt + rt);
                else if (x == '-')
                    stack.push(lt - rt);
                else if (x == '*')
                    stack.push(lt * rt);
                else if (x == '/')
                    stack.push(lt / rt);
            }

        }
        answer = stack.pop();
        return answer;
    }


    public static void main(String[] args) {
        Stack_4 main = new Stack_4();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(main.solution(str));
    }
}
