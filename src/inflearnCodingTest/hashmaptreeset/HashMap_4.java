package inflearnCodingTest.hashmaptreeset;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_4 {
    // 4. 모든 아나그램 찾기
    public static int solution(String a, String b) {
        int ans = 0;
        int k = b.length() - 1;

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        for (char x : b.toCharArray()) {
            am.put(x, am.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < k; i++) {
            bm.put(a.charAt(i), bm.getOrDefault(a.charAt(i), 0) + 1);
        }

        int lt = 0;

        for (int rt = k; rt < a.length(); rt++) {
            bm.put(a.charAt(rt), bm.getOrDefault(a.charAt(rt), 0) + 1);
            if (am.equals(bm)) ans++;
            bm.put(a.charAt(lt), bm.get(a.charAt(lt)) - 1);
            if (!bm.containsKey(a.charAt(lt)) || bm.get(a.charAt(lt)) == 0) // !bm.containsKey(a.charAt(lt)) 필요 x
                bm.remove(a.charAt(lt));
            lt++;
        }

        return ans;
    }

    public static void main(String[] args) {
        HashMap_4 main = new HashMap_4();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();

        System.out.println(main.solution(s, t));
    }
}
