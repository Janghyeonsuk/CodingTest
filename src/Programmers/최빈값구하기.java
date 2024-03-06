package Programmers;

import java.util.Arrays;

public class 최빈값구하기 {
    public int solution(int[] array) {
        int answer = 0;
        int[] cnt = new int[1001];
        int max = Integer.MIN_VALUE;

        Arrays.sort(array);

        for(int i = 0; i <array.length; i++)
            cnt[array[i]]++;

        for(int i = 0; i < cnt.length; i++){
            if(max < cnt[i]) {
                max = cnt[i];
                answer = i;
            } else if (max == cnt[i])
                answer = -1;
        }

        return answer;
    }
}
