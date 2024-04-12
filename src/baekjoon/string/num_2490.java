package baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2490 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            String[] arr = {"D", "C", "B", "A", "E"};

            for (int i = 0; i < 3; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int sum = 0;
                while(st.hasMoreTokens()){
                    sum+= Integer.parseInt(st.nextToken());
                }
                sb.append(arr[sum]).append("\n");
            }

            System.out.print(sb);
        }
    }
