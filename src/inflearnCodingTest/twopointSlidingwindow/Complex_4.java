package inflearnCodingTest.twopointSlidingwindow;

import java.io.*;
import java.util.StringTokenizer;

public class Complex_4 {
    //4. 연속 부분 수열
    public int solution(int n, int m, int[] arr) {
        int ans = 0;
        int lt = 0;
        int sum = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(sum == m) ans++;
            if(sum > m){
                while(sum > m){
                    sum -= arr[lt++];
                    if(sum == m) ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        Complex_4 T = new Complex_4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());


        bw.write(String.valueOf(T.solution(n, m, arr)));

        bw.flush();
        bw.close();
        br.close();
    }
}
