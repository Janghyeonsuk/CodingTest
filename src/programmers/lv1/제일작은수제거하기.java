package programmers.lv1;

import java.util.*;

public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            Arrays.fill(arr, -1);
            return arr;
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            for (int a : arr)
                list.add(a);

            int min = Arrays.stream(arr).min().getAsInt();
            list.remove(Integer.valueOf(min));

            return list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }

    public static void main(String[] args) {
        제일작은수제거하기 T = new 제일작은수제거하기();
        int[] arr = {4, 3, 2, 1};
        int[] answer = T.solution(arr);
        for (int i = 0; i < answer.length; i++)
            System.out.println(answer[i]);
    }
}
