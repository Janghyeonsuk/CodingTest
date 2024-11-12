package programmers.lv0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 안전지대 {
    static int dn = 8;
    static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
    static int[] dy = {-1, -1, -1, 0, 1, 1, 1, 0};

    public static int solution(int[][] board) {
        int ans = 0;
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1)
                    list.add(new int[]{i, j});
            }
        }

        for (int[] arr : list) {
            for (int i = 0; i < dn; i++) {
                int nx = arr[0] + dx[i];
                int ny = arr[1] + dy[i];
                if (nx >= 0 && nx < board.length && ny >= 0 && ny < board.length)
                    board[nx][ny] = 1;
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0)
                    ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        int[][] board = new int[5][5];
        for (int i = 0; i < 5; i++)
            Arrays.fill(board[i], 0);
        board[3][2] = 1;

        System.out.println(solution(board));
    }
}
