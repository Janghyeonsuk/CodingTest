package programmers.lv0;

import java.util.*;

public class 전국대회선발고사 {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < attendance.length; i++){
            if(attendance[i])
                map.put(rank[i], i);
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        int tmp = 10000;
        for(int i = 0; i < 3; i++){
            answer += tmp * map.get(list.get(i));
            tmp /= 100;
        }


        return answer;
    }
}
