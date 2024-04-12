package inflearnCodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_10 {
    //10. 가장 짧은 문자 거리
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;

        //왼쪽 t와의 거리
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000; // 오른쪽 비교를 위해서 p 초기화

        //오른쪽 t와의 거리
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        String_10 main = new String_10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        char c = st.nextToken().charAt(0);

        for (int i : main.solution(str, c))
            System.out.print(i + " ");
    }
}

