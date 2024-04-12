package Programmers.lv0;

public class k의개수 {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        String strK = String.valueOf(k);
        for (int l = i; l <= j; l++) {
            String value = String.valueOf(l);
            if (value.contains(strK)) {
                String[] s = value.split("");
                for (String alpha : s) {
                    if (alpha.equals(strK))
                        cnt++;
                }
            }
        }
        return cnt;
    }
}
