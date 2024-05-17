package inflearnCodingTest.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_7 {
    // 7. 교육과정 설계
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : need.toCharArray()) Q.offer(x);

        for (char x : plan.toCharArray()) {
            if (Q.contains(x))
                if (x != Q.poll()) return "NO";
        }

        if (!Q.isEmpty()) answer = "NO";

        return answer;
    }


    public static void main(String[] args) {
        Queue_7 main = new Queue_7();
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        System.out.println(main.solution(a, b));
    }
}
