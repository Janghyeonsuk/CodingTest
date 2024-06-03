package inflearnCodingTest.hashmaptreeset;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1 {
    // 1. 학급 회장
    public char solution(int n, String s) {
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

//        System.out.println(map.containsKey('A'));
//        System.out.println(map.size());
//        System.out.println(map.remove('A'));

        for (char key : map.keySet()) {
//            System.out.println(key + " " + map.get(key));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        HashMap_1 main = new HashMap_1();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        System.out.println(main.solution(n, str));
    }
}
