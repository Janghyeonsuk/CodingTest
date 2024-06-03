package inflearnCodingTest.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Merry implements Comparable<Merry> {
    public int time;
    public char state;

    public Merry(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Merry o) {
        if (this.time == o.time) return this.state - o.state;
        return this.time - o.time;
    }
}

public class Greedy_3 {
    static int n;
    static ArrayList<Merry> arr = new ArrayList<>();

    public static int solution() {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;
        for (Merry o : arr) {
            if (o.state == 'S') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            arr.add(new Merry(s, 'S'));
            int e = Integer.parseInt(st.nextToken());
            arr.add(new Merry(e, 'E'));
        }

        System.out.print(solution());
    }
}
