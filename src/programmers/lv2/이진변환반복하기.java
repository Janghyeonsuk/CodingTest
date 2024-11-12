package programmers.lv2;

public class 이진변환반복하기 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (!s.equals("1")) {
            answer[1] += s.length(); // 원래 길이
            s = s.replace("0", "");       // 모든 0 제거
            int newLen = s.length();   // 제거 후 길이

            answer[0]++;
            answer[1] -= newLen;
            s = Integer.toBinaryString(newLen);      // 길이를 이진수로 변환
        }
        return answer;
    }
}

