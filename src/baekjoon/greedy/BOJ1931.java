package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Meet implements Comparable<Meet> {
    public int start, end;

    public Meet(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meet o) {
        if (this.end == o.end) return this.start - o.start;
        else return this.end - o.end;
    }
}

public class BOJ1931 {
    public static int solution(int n, Meet[] arr) {
        int answer = 0;
        int end = -1;

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i].start >= end) {
                end = arr[i].end;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Meet[] arr = new Meet[N];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[i] = new Meet(start, end);
        }

        System.out.println(solution(N, arr));
        br.close();
    }
}
