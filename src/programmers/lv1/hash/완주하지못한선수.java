package programmers.lv1.hash;

import java.util.*;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();

        for(String str : participant)
            hm.put(str, hm.getOrDefault(str, 0) + 1);

        for(String str : completion)
            hm.put(str, hm.get(str) - 1);

        for(String name : hm.keySet())
            if(hm.get(name) != 0) answer = name;
        return answer;
    }
}
