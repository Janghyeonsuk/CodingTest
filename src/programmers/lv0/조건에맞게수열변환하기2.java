package programmers.lv0;

public class 조건에맞게수열변환하기2 {
    public int solution(int[] arr) {
        int answer = 0;
        while (true){
            boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];

                if(num >= 50 && num % 2 == 0){
                    num /= 2;
                    flag = true;
                } else if(num < 50 && num % 2 != 0){
                    num = num * 2 + 1;
                    flag = true;
                }
                arr[i] = num;
            }
            answer++;
            if(!flag){
                break;
            }
        }
        return answer - 1;
    }
}
