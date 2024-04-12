package Programmers.lv0;

import java.util.Arrays;

public class 이의영역 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int a = -1;
        int b = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2 && a == -1)
                a = i;
            if(arr[i] == 2 && a != -1)
                b = i;
        }
        if(a == -1 && b == -1)
            return new int[]{-1};

        answer = Arrays.copyOfRange(arr, a, b + 1);

        return answer;
    }
}
