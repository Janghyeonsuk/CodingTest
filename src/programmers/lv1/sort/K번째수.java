package programmers.lv1.sort;

import java.util.*;


public class K번째수 {

    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(arr);
            answer.add(arr[commands[i][2] - 1]);
        }
        return answer;
    }
}
