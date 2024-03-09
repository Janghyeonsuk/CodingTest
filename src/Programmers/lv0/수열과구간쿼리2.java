package Programmers.lv0;

public class 수열과구간쿼리2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i = 0; i< queries.length; i++){
            int min = Integer.MAX_VALUE;
            boolean flag = true;
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                int k = queries[i][2];
                if(arr[j] > k){
                    min = Math.min(min, arr[j]);
                    flag = false;
                }
            }
            if(flag) answer[i] = -1;
            else answer[i] = min;
        }

        return answer;
    }
}
