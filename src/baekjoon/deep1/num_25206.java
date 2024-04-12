package baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class num_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] gradeScore = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        HashMap<String, Double> hashMap = new HashMap<>();

        for (int i = 0; i < 9; i++)
            hashMap.put(gradeList[i], gradeScore[i]);

        double scoreSum = 0;
        double creditSum = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (hashMap.containsKey(grade)) {
                scoreSum += credit * hashMap.get(grade);
                creditSum += credit;
            }

        }
        System.out.printf("%.6f\n", scoreSum / creditSum);

        br.close();
    }
}
