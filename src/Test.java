import java.util.*;
import java.util.stream.IntStream;


public class Test {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0)
                end = start + query[i] - 1;
            else
                start += query[i];
        }

        return Arrays.copyOfRange(arr, start, end + 2);
    }
    public static void main(String[] args) {
        Test T = new Test();
        for(int i : T.solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2}))
            System.out.println(i + " ");
    }

}
