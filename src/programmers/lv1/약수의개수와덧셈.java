package programmers.lv1;

public class 약수의개수와덧셈 {
    public boolean check(int num){
        int cnt = 0;

        for(int i = 1; i <= num; i++)
            if(num % i == 0) cnt++;

        return cnt % 2 == 0;
    }

    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++){
            if(check(i)) answer += i;
            else answer -= i;
        }

        return answer;
    }
}
