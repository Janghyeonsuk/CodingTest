package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA1966 {
    static StringBuilder sb = new StringBuilder();
    static int[] dayend = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void solution(int n, int[] arr) {
//        //1. 선택 정렬
//        for (int i = 0; i < n - 1; i++) {
//            int idx = i;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[idx]) idx = j;
//            }
//            int tmp = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = tmp;
//        }
//
//
//        //2. 버블 정렬
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
//
//        //3. 삽입 정렬
//        for (int i = 1; i < n; i++) {
//            int tmp = arr[i], j;
//            for (j = i - 1; j >= 0; j--) {
//                if (arr[j] > tmp) arr[j + 1] = arr[j];
//                else break;
//            }
//            arr[j + 1] = tmp;
//        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            sb.append(arr[i] + " ");
        }
        sb.append("\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st.nextToken());

            solution(n, arr);
        }
        System.out.println(sb);
        br.close();
    }
}

