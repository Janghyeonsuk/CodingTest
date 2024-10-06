package programmers.lv1.hash;

import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int cnt = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }

        if (set.size() >= cnt) return cnt;
        else return set.size();
    }
}
