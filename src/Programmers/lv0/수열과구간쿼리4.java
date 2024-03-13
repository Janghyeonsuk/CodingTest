package Programmers.lv0;

public class 수열과구간쿼리4 {
    public int[] solution(int[] arr, int[][] queries) {

        for(int[] query : queries){
            for(int i = query[0]; i <= query[1]; i++){
                int k = query[2];
                if( i % k == 0)
                    arr[i]++;
            }
        }

        return arr;
    }
}
