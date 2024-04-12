package baekjoon.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class num_11718 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strList = new ArrayList<>();

        String line;

        int count = 0;
        while ((line = br.readLine()) != null) {
            if (line.isEmpty() || count > 100) {
                break;
            } else {
                strList.add(line);
                count++;
            }
        }

        for (String s : strList) {
            System.out.println(s);
        }
    }
}
