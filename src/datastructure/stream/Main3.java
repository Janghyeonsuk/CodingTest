package datastructure.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        // 주사위를 100번 던져서 6이 나올 확률을 구하시오.
//        Random r = new Random();
//        var count = Stream.generate(() -> r.nextInt(6) + 1)
//                .limit(100)
//                .filter(n -> n == 6)
//                .count();
//
//        System.out.println(count);


        // 1~9 사이 값 중에서 겹치지 않게 3개를 출력하라.
//        Random r = new Random();
//        int[] arr = Stream.generate(() -> r.nextInt(9) + 1)
//                .distinct()
//                .limit(3)
//                .mapToInt(i -> i)
//                .toArray();
//
//        System.out.println(Arrays.toString(arr));

        // 0~200 사이 값 중에서 랜덤값 5개를 뽑아 큰 순서대로 표시하시오.
        Random r = new Random();
        int[] arr = Stream.generate(() -> r.nextInt(200))
                .limit(5)
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();

        System.out.println(Arrays.toString(arr));
    }
}
