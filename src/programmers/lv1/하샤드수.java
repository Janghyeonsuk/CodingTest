package programmers.lv1;

import java.util.*;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = x;
        int sum = 0;

//        String[] s = String.valueOf(x).split("");
//
//        for(String str : s)
//            sum += Integer.parseInt(str);

        while (tmp > 0) {
            sum += tmp % 10;
            tmp /= 10;
        }

        if (x % sum != 0)
            answer = false;

        return answer;
    }
}
