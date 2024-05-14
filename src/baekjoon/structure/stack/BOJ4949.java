package baekjoon.structure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            Stack<String> stack = new Stack<>();
            if (str.equals("."))
                break;

            String[] s = str.split("");
            for (String ch : s) {
                switch (ch) {
                    case ("("):
                    case ("["):
                        stack.push(ch);
                        break;
                    case (")"):
                        if (!stack.empty() && stack.peek().equals("(")) {
                            stack.pop();
                            break;
                        } else {
                            stack.push(ch);
                            break;
                        }
                    case ("]"):
                        if (!stack.empty() && stack.peek().equals("[")) {
                            stack.pop();
                            break;
                        } else {
                            stack.push(ch);
                            break;
                        }
                    default:
                        break;
                }
            }
            if(stack.empty())
                System.out.println("yes");
            else
                System.out.println("no");
        }

    }
}
