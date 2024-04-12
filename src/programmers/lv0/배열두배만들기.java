package programmers.lv0;

import java.util.Arrays;

public class 배열두배만들기 {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
