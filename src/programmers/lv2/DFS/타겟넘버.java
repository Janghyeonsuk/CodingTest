package programmers.lv2.DFS;

public class 타겟넘버 {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        DFS(numbers, target, 0, 0);
        return answer;
    }

    public void DFS(int[] numbers, int target, int L, int sum) {
        if (L == numbers.length) {
            if (sum == target)
                answer++;
            return;
        }
        DFS(numbers, target, L + 1, sum + numbers[L]);
        DFS(numbers, target, L + 1, sum - numbers[L]);
    }
}
