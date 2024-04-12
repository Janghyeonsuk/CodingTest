package programmers.lv0;

import java.util.Arrays;

public class A로B만들기 {
    public int solution(String before, String after) {
        String[] b = before.split("");
        String[] a = after.split("");
        Arrays.sort(b);
        Arrays.sort(a);

        return Arrays.equals(a,b) ? 1 : 0;
    }
}
