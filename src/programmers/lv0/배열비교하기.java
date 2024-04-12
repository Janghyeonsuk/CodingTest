package programmers.lv0;
import java.util.stream.*;

public class 배열비교하기 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);

        if(answer == 0)
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());

        return answer;
    }
}
