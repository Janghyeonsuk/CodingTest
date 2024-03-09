package Programmers.lv0;

public class 분수의덧셈 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a = numer1 * denom2 + numer2 * denom1;
        int b = denom1 * denom2;
        int gcd = 0;

        for(int i = 1; i<= a && i <=b; i++){
            if(a%i == 0 && b%i == 0)
                gcd = i;
        }

        answer[0] = a / gcd;
        answer[1] = b / gcd;

        return answer;
    }
}
