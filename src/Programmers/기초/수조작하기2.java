package Programmers.기초;

public class 수조작하기2 {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();

        for(int i = 1; i < numLog.length; i++){
            int num = numLog[i] - numLog[i-1];
            switch (num){
                case 1:
                    answer.append("w");
                    break;
                case -1:
                    answer.append("s");
                    break;
                case 10:
                    answer.append("d");
                    break;
                case -10:
                    answer.append("a");
                    break;
                default:
                    break;
            }
        }

        return answer.toString();
    }
}
