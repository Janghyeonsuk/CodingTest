package programmers.lv0;

public class 가까운수 {
    public int solution(int[] array, int n) {
        int answer = 0;
        int m = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int tmp = Math.abs(array[i] - n);
            if (tmp < m) {
                m = tmp;
                answer = array[i];
            } else if (tmp == m)
                answer = Math.min(answer, array[i]);
        }

        return answer;
    }
}