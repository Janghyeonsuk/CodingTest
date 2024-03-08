package Programmers.기초;

public class 주사위게임2 {
    // Math.pow()는 반환 값이 (double)이므로 return이 int형일때 (int)로 형변환 해줄것
    public int solution(int a, int b, int c) {
        int answer = 1;
        int same = 1;

        if(a == b || a == c || b == c) same = 2;
        if(a == b && b == c) same = 3;

        for(int i = 1; i <= same; i++)
            answer *= (int)(Math.pow(a, i) + Math.pow(b,i) + Math.pow(c,i));

        return answer;
    }
}
