package programmers.lv2.BFS;

import java.util.*;

public class 리코쳇로봇 {
    int dn = 4;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};

    public int solution(String[] board) {
        int answer = 0;
        int bx = board.length;
        int by = board[0].length();
        int rx = 0, ry = 0, gx = 0, gy = 0;
        boolean[][] isused = new boolean[bx][by];
        char[][] map = new char[bx][by];

        for (int i = 0; i < bx; i++) {
            for (int j = 0; j < by; j++) {
                map[i][j] = board[i].charAt(j);

                if (map[i][j] == 'R') {
                    rx = i;
                    ry = j;
                }

                if (map[i][j] == 'G') {
                    gx = i;
                    gy = j;
                }
            }
        }

        Queue<int[]> Q = new ArrayDeque<>();
        Q.add(new int[]{rx, ry});
        isused[rx][ry] = true;

        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int[] p = Q.poll();
                if (p[0] == gx && p[1] == gy) return answer;

                for (int j = 0; j < dn; j++) {
                    int nx = p[0] + dx[j];
                    int ny = p[1] + dy[j];
                    if (nx < 0 || nx >= bx || ny < 0 || ny >= by || map[nx][ny] == 'D') continue;

                    while (nx >= 0 && nx < bx && ny >= 0 && ny < by && map[nx][ny] != 'D') {
                        nx += dx[j];
                        ny += dy[j];
                    }

                    nx -= dx[j];
                    ny -= dy[j];

                    if (!isused[nx][ny]) {
                        isused[nx][ny] = true;
                        Q.add(new int[]{nx, ny});
                    }
                }
            }
            answer++;
        }


        return -1;
    }
}