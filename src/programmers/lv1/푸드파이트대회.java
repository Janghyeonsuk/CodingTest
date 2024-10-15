package programmers.lv1;

public class 푸드파이트대회 {
    public String solution(int[] food) {
        String answer = "";

        for(int i = 1; i < food.length; i++){
            int count = food[i] / 2;
            while(count-->0){
                answer += String.valueOf(i);
            }
        }


        String reverse = new StringBuilder(answer).reverse().toString();
        answer += "0";
        answer += reverse;

        return answer;
    }
}