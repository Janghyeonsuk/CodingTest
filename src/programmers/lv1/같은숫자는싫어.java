package programmers.lv1;

import java.util.*;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        // 스택을 통한 연속 숫자 제거
        for(int num : arr){
            if(stack.isEmpty() || stack.peek() != num)
                stack.push(num);
        }

        // ArrayList에 담기
        for(int x : stack)
            list.add(x);

        // int[]로 변환
        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
