package programmers.lv0;

import java.util.*;

public class 소인수분해 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                while(n % i == 0){
                    n /= i;
                }
                list.add(i);
            }

        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
