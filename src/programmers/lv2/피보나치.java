package programmers.lv2;

public class 피보나치 {
    public int solution(int n) {
        if (n == 0) return 0; // n이 0일 경우 0 반환
        if (n == 1) return 1; // n이 1일 경우 1 반환

        int[] fibo = new int[n + 1]; // DP 배열 생성
        fibo[0] = 0;
        fibo[1] = 1;

        // 반복적으로 피보나치 계산
        for (int i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1234567; // 모듈러 연산 적용
        }

        return fibo[n];
    }
}
