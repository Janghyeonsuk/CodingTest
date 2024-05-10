/*
package programmers.lv0;

public class 그림확대 {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        for(String str : picture){
            StringBuilder sb = new StringBuilder();
            String[] s = str.split("");
            for(String c : s)
                sb.append(c.repeat(k));

            String result = sb.toString();
            for(int i = 0; i < k; i++)
                answer[idx++] = result;
        }

        return answer;
    }
}
*/
