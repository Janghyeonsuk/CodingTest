package programmers.lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


class Distance implements Comparable<Distance> {
    public int dis, idx, val;

    public Distance(int dis, int idx, int val) {
        this.dis = dis;
        this.idx = idx;
        this.val = val;
    }

    @Override
    public int compareTo(Distance o) {
        if (this.dis == o.dis)
            return o.val - this.val;
        return this.dis - o.dis;
    }
}

public class 특이한정렬 {
    public static int[] solution(int[] numlist, int n) {
        int len = numlist.length;
        Distance[] list = new Distance[len];
        int[] answer = new int[len];

        for (int i = 0; i < len; i++)
            list[i] = new Distance(Math.abs(n - numlist[i]), i, numlist[i]);

        Arrays.sort(list);

        for (int i = 0; i < len; i++)
            answer[i] = list[i].val;

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numlist = new int[]{1, 2, 3, 4, 5, 6};
        for (int i : solution(numlist, n)) {
            System.out.print(i + " ");
        }
    }
}
