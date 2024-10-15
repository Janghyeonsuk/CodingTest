package programmers.lv1;

public class 콜라츠추측 {
    public int solution(long num) {
        int cnt = 0;

        // 주어진 수가 1인 경우 0 반환
        if (num == 1) {
            return 0;
        }

        // 콜라츠 수열 계산
        while (num > 1) {
            if (cnt >= 500) {
                return -1; // 500회 초과 시 -1 반환
            }
            // 짝수 처리
            if (num % 2 == 0) {
                num /= 2;
            } else { // 홀수 처리
                num = num * 3 + 1;
            }
            cnt++;
        }

        return cnt; // 반복 횟수 반환
    }
}
