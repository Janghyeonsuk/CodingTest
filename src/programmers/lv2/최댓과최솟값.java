package programmers.lv2;

import java.util.*;

public class 최댓과최솟값 {
    public String solution(String s) {
        String[] str = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        for (String x : str)
            list.add(Integer.valueOf(x));
        int[] arr = list.stream().mapToInt(i -> i).toArray();

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        return min + " " + max;
    }
}
