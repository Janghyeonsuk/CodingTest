package programmers.lv0;

public class 정사각형으로만들기 {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        if(row > col){
            int[][] tmp = new int[row][row];
            for(int i = 0; i < row; i++){
                System.arraycopy(arr[i], 0, tmp[i], 0, col);
                tmp[i][col] = 0;
            }
            return tmp;
        } else if(row < col){
            int[][] tmp = new int[col][col];
            for(int i = 0; i < row; i++){
                System.arraycopy(arr[i], 0, tmp[i], 0, col);
                tmp[row][i] = 0;
            }
            return tmp;
        } else
            return arr;
    }
}
