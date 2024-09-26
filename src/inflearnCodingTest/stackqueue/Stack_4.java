package inflearnCodingTest.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Stack_4 {
    // 4. 후위 연산식 계산

    public static int solution(String str) {
        int ans;
        Stack<Integer> S = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) S.push(x - '0');
            else {
                int rt = S.pop();
                int lt = S.pop();

                switch (x) {
                    case '+':
                        S.push(lt + rt);
                        break;
                    case '-':
                        S.push(lt - rt);
                        break;
                    case '*':
                        S.push(lt * rt);
                        break;
                    case '/':
                        S.push(lt / rt);
                        break;
                }
            }
        }

        ans = S.pop();

        return ans;
    }


    public static void main(String[] args) {
        Stack_4 main = new Stack_4();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(solution(str));
    }
}
