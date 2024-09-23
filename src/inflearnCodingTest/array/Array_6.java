package inflearnCodingTest.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Array_6 {
    // 6.뒤집은 소수
    private static boolean isPrime(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
//            int tmp = arr[i];
//            int res = 0;
//            while (tmp > 0) {
//                int t = tmp % 10;
//                res = res * 10 + t;
//                tmp = tmp / 10;
//            }
            int res = Integer.parseInt(new StringBuilder(String.valueOf(arr[i])).reverse().toString());
            if (isPrime(res))
                answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for (int i : solution(arr))
            System.out.print(i + " ");
    }
}
