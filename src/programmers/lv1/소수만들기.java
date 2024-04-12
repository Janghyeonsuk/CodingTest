package programmers.lv1;

public class 소수만들기 {
    public boolean isPrime(int n){
        boolean flag = true;

        for(int i = 2; i < n; i++)
            if(n % i == 0)
                flag = false;

        return flag;
    }

    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0 ; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
