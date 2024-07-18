package groom.level1;

import java.io.*;
import java.util.*;

public class 숫자제거배열 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ans = 0;
        ArrayList<String> list = new ArrayList<>();
        int N = Integer.parseInt(st.nextToken());
        String K = st.nextToken();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            String num = st.nextToken();
            list.add(num);
        }

        for (String s : list)
            if (!s.contains(K)) ans++;

        System.out.println(ans);
    }
}