package inflearnCodingTest.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Stack_3 {
    //3. 크레인 인형 뽑기 (카카오)
    public int solution(int n, int m, int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int pos : moves) {
            for (int i = 0; i < n; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else
                        stack.push(tmp);
                    break;
                }
            }
        }

        return answer;

//        int ans = 0;
//        Stack<Integer> S = new Stack<>();
//        for (int i = 0; i < m; i++) {
//            int pos = moves[i] - 1;
//            for (int j = 0; j < n; j++) {
//                if (board[j][pos] != 0) {
//                    int tmp = board[j][pos];
//                    board[j][pos] = 0;
//                    if (!S.isEmpty() && S.peek() == tmp) {
//                        S.pop();
//                        ans += 2;
//                    } else {
//                        S.push(tmp);
//                    }
//                    break;
//                }
//            }
//        }
//
//        return ans;
    }


    public static void main(String[] args) {
        Stack_3 main = new Stack_3();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
        }

        int m = in.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++)
            moves[i] = in.nextInt();

        System.out.println(main.solution(n, m, board, moves));
    }
}
