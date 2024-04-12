package inflearnCodingTest.HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_2 {
    // 2. 아나그램(해쉬)
    public String solution(String s1, String s2) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : s2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x) == 0)
                return "NO";
            map.put(x, map.get(x) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        HashMap_2 main = new HashMap_2();
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(main.solution(str1, str2));
    }
}
