package programmers.lv0;

public class 유한소수판별법 {
    public int solution(int a, int b) {
        // 1. a/b를 기약분수로 만들기 위해 최대공약수로 나누기
        b /= gcd(a, b);

        // 2. 분모(b)의 소인수가 2와 5만 있는지 확인
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }

        // 3. 최종적으로 b가 1이라면 유한소수, 아니면 무한소수
        return (b == 1) ? 1 : 2;
    }

    // 최대공약수를 구하는 메서드 (유클리드 호제법)
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

