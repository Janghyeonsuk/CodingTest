package Programmers.lv0;

import java.util.Arrays;

public class 배열조각하기 {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0)
                end = start + query[i];
            else
                start += query[i];
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
