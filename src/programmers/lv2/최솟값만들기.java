package programmers.lv2;

import java.util.*;

public class 최솟값만들기 {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int len = A.length - 1;


        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++)
            answer += A[i] * B[len - i];

        return answer;
    }
}
