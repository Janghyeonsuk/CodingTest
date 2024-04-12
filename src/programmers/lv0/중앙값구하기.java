package programmers.lv0;

import java.util.Arrays;

public class 중앙값구하기 {
    public int solution(int[] array) {
        Arrays.sort(array);

        int n = array.length / 2;

        return array[n];
    }
}
