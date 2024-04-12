package baekjoon.자료구조.linkedlist;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

// 연결리스트와 리스트 이터레이터 활용
public class num_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Character> list = new LinkedList<>();
        String str = br.readLine();
        for (char c : str.toCharArray()) list.add(c);

        int n = Integer.parseInt(br.readLine());

        ListIterator<Character> iter = list.listIterator();

        while (iter.hasNext())
            iter.next();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "L":
                    if (iter.hasPrevious())
                        iter.previous();
                    break;
                case "D":
                    if (iter.hasNext())
                        iter.next();
                    break;
                case "B":
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case "P":
                    iter.add(st.nextToken().charAt(0));
                    break;
                default:
                    break;
            }
        }

        for (char c : list)
            bw.write(c);

        br.close();
        bw.flush();
        bw.close();
    }
}
