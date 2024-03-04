package InflearnCodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 3.문장 속 단어
public class String_3 {
    public String solution(String str) {
        String answer = "";
        int maxLen = Integer.MIN_VALUE;

        /*
        String[] strArray = str.split(" ");
        for (String s : strArray) {
            int len = s.length();
            if (len > maxLen) {
                maxLen = s.length();
                answer = s;
            }
        }
        */

        // index, substring use
        int pos;

        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();

            if (len > maxLen) {
                maxLen = len;
                answer = tmp;
            }

            str = str.substring(pos + 1);
        }
        if (str.length() > maxLen)
            answer = str;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        String_3 main = new String_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(main.solution(str));
    }
}

//public class Main {
//public String solution(String str) {
//    String answer = "";
//    int m = Integer.MIN_VALUE;
//    String[] strArray = str.split(" ");
//
//    for (String x : strArray) {
//        int len = x.length();
//        if(len > m){
//            m = len;
//            answer = x;
//        }
//    }
//
//    return answer;
//}
//
//    public static void main(String[] args) throws IOException {
//        Main main = new Main();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        System.out.println(main.solution(str));
//    }
//}