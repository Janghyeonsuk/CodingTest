package book.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 거스름돈 {
    static Integer[] coin = new Integer[]{10, 50, 100, 500};

    public static int solution(int n){
        int ans = 0;
        Arrays.sort(coin, Comparator.reverseOrder());

        while(n > 0){
            for (Integer integer : coin) {
                if (n >= integer) {
                    ans += n / integer;
                    n %= integer;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));

    }
}
