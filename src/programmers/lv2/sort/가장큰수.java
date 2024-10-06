package programmers.lv2.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 가장큰수 {
    static ArrayList<Integer> list;

    public String solution() {
        String answer = "";
        String[] arr = new String[list.size()];

        for (int i = 0; i < list.size(); i++)
            arr[i] = String.valueOf(list.get(i));

        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        StringBuilder sb = new StringBuilder();
        for (String s : arr)
            sb.append(s);

        answer = sb.toString();

        if (answer.charAt(0) == '0') return "0";
        else return answer;
    }

    public static void main(String[] args) throws IOException {
        가장큰수 T = new 가장큰수();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        list = new ArrayList();
        while (st.hasMoreElements())
            list.add(Integer.parseInt(st.nextToken()));
        System.out.println(T.solution());
    }
}
