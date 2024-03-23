package Programmers.lv0;

public class 합성수찾기 {
    public boolean check(int n){
        int cnt = 0;
        for(int i = 1; i <= n; i++)
            if(n % i  == 0)
                cnt++;
        if(cnt >= 3)
            return true;
        else
            return false;
    }

    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i ++)
            if(check(i))
                answer++;

        return answer;
    }
}
