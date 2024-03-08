package Programmers.입문;

import java.util.stream.IntStream;

public class 짝수는싫어요 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 1).toArray();
    }
}
