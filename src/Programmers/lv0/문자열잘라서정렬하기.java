package Programmers.lv0;

import java.util.*;

public class 문자열잘라서정렬하기 {
    public String[] solution(String myString) {
        String[] tmp = myString.split("x");
        Arrays.sort(tmp);
        ArrayList <String> list = new ArrayList<>();

        for (int i = 0; i < tmp.length; i++)
            if (!tmp[i].isEmpty())
                list.add(tmp[i]);

        String[] answer = new String[list.size()];
        list.toArray(answer);

        return answer;
    }
}
