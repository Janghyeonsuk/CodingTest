package programmers.lv2.twopointer;

public class 숫자의표현 {
    public int solution(int n) {
        int answer = 1;
        int lt = 1;
        int sum = 0;

        for(int rt = 1; rt < n; rt++){
            sum += rt;
            if(sum == n) answer++;

            if(sum > n){
                while(sum > n){
                    sum -= lt++;
                    if(sum == n) answer++;
                }
            }
        }


        return answer;
    }
}
