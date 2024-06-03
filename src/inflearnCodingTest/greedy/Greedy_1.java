package inflearnCodingTest.greedy;

import java.io.*;
import java.util.*;

class Body implements Comparable<Body> {
    public int h, w;

    public Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        if (this.h == o.h) return o.w - this.w;
        else return o.h - this.h;
    }
}

public class Greedy_1 {
    static int n;
    static ArrayList<Body> arr = new ArrayList<>();

    public static int solution() {
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;

        for (Body o : arr) {
            if (o.w > max) {
                max = o.w;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            arr.add(new Body(h, w));
        }

        System.out.print(solution());

    }
}
