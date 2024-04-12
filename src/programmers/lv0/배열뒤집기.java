package programmers.lv0;

public class 배열뒤집기 {
    public int[] solution(int[] num_list) {
        int lt = 0;
        int rt = num_list.length - 1;

        while (lt < rt){
            int temp = num_list[rt];
            num_list[rt] = num_list[lt];
            num_list[lt] = temp;
            lt++;
            rt--;
        }

        return num_list;
    }
}
