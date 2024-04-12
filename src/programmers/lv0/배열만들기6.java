package programmers.lv0;

import java.util.Stack;

public class 배열만들기6 {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();

        for(int i : arr){
            if(!stk.isEmpty() && i == stk.peek())
                stk.pop();
            else
                stk.push(i);
        }

        return stk.isEmpty() ? new int[]{-1} : stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
