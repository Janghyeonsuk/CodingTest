package Programmers.lv0;

import java.util.Arrays;

public class 글자지우기 {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        StringBuilder sb = new StringBuilder(my_string);
        for (int i = indices.length - 1; i >= 0; i--)
            sb.deleteCharAt(indices[i]);

        return sb.toString();
    }
}
