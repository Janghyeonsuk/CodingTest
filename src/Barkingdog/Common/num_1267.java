package Barkingdog.Common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sumY = 0;
        int sumM = 0;
        int n = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int sec = Integer.parseInt(st.nextToken());

            sumY += ((sec / 30) + 1) * 10;
            sumM += ((sec / 60) + 1) * 15;
        }

        if (sumY == sumM) {
            System.out.println("Y M " + sumY);
        } else if (sumY > sumM) {
            System.out.println("M " + sumM);
        } else
            System.out.println("Y " + sumY);
        br.close();
    }
}
