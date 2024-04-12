package programmers.lv0;

import java.util.ArrayList;

public class 배열만들기5 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(String str : intStrs){
            int tmp = Integer.parseInt(str.substring(s, s + l));
            if(tmp > k)
                answer.add(tmp);
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
