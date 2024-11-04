package programmers.lv1;

import java.util.*;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] arr = s.split("");

        Arrays.sort(arr, Collections.reverseOrder());

        for(String x : arr)
            answer.append(x);

        return answer.toString();
    }
}
