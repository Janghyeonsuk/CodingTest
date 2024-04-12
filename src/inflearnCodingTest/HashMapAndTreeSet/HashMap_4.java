package inflearnCodingTest.HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_4 {
    // 4. 모든 아나그램 찾기
    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for (char x : b.toCharArray())
            bm.put(x, bm.getOrDefault(x, 0) + 1);


        int k = b.length() - 1;

        for (int rt = 0; rt < k; rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
        }

        int lt = 0;
        for (int rt = k; rt < a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
            if (am.equals(bm))
                answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
            if (am.get(a.charAt(lt)) == 0)
                am.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        HashMap_4 main = new HashMap_4();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();

        System.out.println(main.solution(s, t));
    }
}
