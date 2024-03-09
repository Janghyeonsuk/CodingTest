package Programmers.lv0;

public class 원소들의곱과합 {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;

        for(int i : num_list){
            mul *= i;
            sum += i;
        }

        int pow = (int) Math.pow(sum,2);

        return mul < pow ? 1 : 0;
    }
}
