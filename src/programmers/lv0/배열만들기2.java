package Programmers.lv0;

import java.util.*;

public class 배열만들기2 {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();

        for(int i = l; i <= r; i ++){
            if(String.valueOf(i).matches("[05]+"))
                answer.add(i);
        }

        return answer.isEmpty() ? new int[]{-1} :answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
