package programmers.pcce;

public class 이웃한칸 {
    public int solution(String[][] board, int h, int w) {
        int cnt = 0;
        int[] dx = {0, 1, 0 , -1};
        int[] dy = {1, 0, -1 , 0};

        String color = board[h][w];
        int hSize = board.length;
        int wSize = board[0].length;

        for(int i = 0; i < 4; i++){
            int nx = h + dx[i];
            int ny = w + dy[i];
            if(nx >= 0  && nx < hSize && ny >= 0 && ny < wSize && board[nx][ny].equals(color))
                cnt++;
        }


        return cnt;
    }
}
