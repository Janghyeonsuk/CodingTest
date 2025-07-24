package programmers.kakao;

public class 신규아이디추천 {
    // String 활용
    public static String solution(String new_id) {
        // 1
        String s = new_id.toLowerCase();

        // 2
        s = s.replaceAll("[^a-z0-9-_.]", "");

        // 3
        while (s.contains("..")) s = s.replace("..", ".");

        // 4
        if (!s.isEmpty() && s.charAt(0) == '.') s = s.substring(1);
        if (!s.isEmpty() && s.charAt(s.length() - 1) == '.') s = s.substring(0, s.length() - 1);

        // 5
        if (s.isEmpty()) s = "a";

        //6
        if (s.length() >= 16) {
            s = s.substring(0, 15);
            while (s.charAt(s.length() - 1) == '.') {
                s = s.substring(0, s.length() - 1);
            }
        }

        //7
        while (s.length() < 3) {
            s += s.charAt(s.length() - 1);
        }

        return s;
    }
}
