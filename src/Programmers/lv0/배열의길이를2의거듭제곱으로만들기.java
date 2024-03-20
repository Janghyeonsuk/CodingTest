package Programmers.lv0;

import java.util.Arrays;

public class 배열의길이를2의거듭제곱으로만들기 {
    public int[] solution1(int[] arr) {
        int length = arr.length;

        while ((length & (length - 1)) != 0)
            length++;

        int[] answer = Arrays.copyOf(arr, length);
        return answer;
    }

    public int[] solution2(int[] arr) {
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }
}
