package programmers.lv0;

public class 등차수열의특정항만더하기 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int cnt = 0;

        for(boolean flag : included){
            if(flag){
                answer += a + (d * cnt++);
            } else
                cnt++;
        }

        return answer;
    }
}
