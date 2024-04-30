import java.io.*;
import java.util.*;

public class Main {
    static int N, A, B, C;
    static StringBuilder sb = new StringBuilder();

    public static void solve(int a, int b, int c) {
        int answer = 0;
        if (b < 2 || c < 3)
            sb.append(-1).append("\n");
        else {
            if (c <= b) {
                answer += b - c + 1;
                b -= answer;
            }
            if (b <= a) {
                answer += a - b + 1;
                a -= answer;
            }

            sb.append(answer).append("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            solve(A, B, C);
        }
        System.out.print(sb);

    }
}

