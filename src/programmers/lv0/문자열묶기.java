package Programmers.lv0;

public class 문자열묶기 {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] len = new int[31];

        for(int i = 0; i < strArr.length; i++)
            len[strArr[i].length()]++;

        for(int num : len)
            answer = Math.max(answer, num);

        return answer;
    }
}
