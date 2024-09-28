package inflearnCodingTest.sortingsearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sorting_7 {
    private static class Point implements Comparable<Point> {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x)
                return this.y - o.y;
            else
                return this.x - o.x;
        }
    }

    public Point[] solution(Point[] arr) {
        Arrays.sort(arr);

        return arr;
    }

    public static void main(String[] args) throws IOException {
        Sorting_7 T = new Sorting_7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        Point[] arr = new Point[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Point(x, y);
        }

        for (Point p : T.solution(arr)) {
            System.out.println(p.x + " " + p.y);
        }
    }
}