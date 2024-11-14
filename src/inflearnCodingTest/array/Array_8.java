package inflearnCodingTest.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Rank {
    public int idx, score;

    public Rank(int idx, int score) {
        this.idx = idx;
        this.score = score;
    }
}

public class Array_8 {
    // 8. 등수 구하기
    public int[] solution(int n, int[] arr) {
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) rank++;
            }
            ans[i] = rank;
        }

        return ans;
    }

    //        public static int[] solution(int n, HashMap<Integer, Integer> map) {
//        int[] answer = new int[n];
//
//        List<Integer> keySet = new ArrayList<>(map.keySet());
//
//        keySet.sort((a, b) -> map.get(b) - map.get(a));
//
//        for (int i = 0; i < n; i++) {
//            answer[i] = keySet.get(i);
//        }
//
//        return answer;
//    }
    public static int[] compare(int n, Rank[] arr) {
        int[] answer = new int[n];
        Arrays.sort(arr, (a, b) -> b.score - a.score);

        for (int i = 0; i < n; i++) {
            answer[i] = arr[i].idx;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Array_8 main = new Array_8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
//        arr[i] = new Rank(i + 1, Integer.parseInt(st.nextToken()));
        for (int i : main.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}
