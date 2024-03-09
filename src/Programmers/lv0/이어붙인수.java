package Programmers.lv0;

public class 이어붙인수 {
    public int solution(int[] num_list) {
        String odd ="";
        String even ="";

        for(int i : num_list){
            if(i % 2 == 1)
                odd += String.valueOf(i);
            else
                even += String.valueOf(i);
        }

        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}
