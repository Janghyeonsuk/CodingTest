package inflearnCodingTest.stackqueue;

import java.util.ArrayDeque;
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

//        String ans = "NO";
//        Queue<Character> Q = new ArrayDeque<>();
//
//        for (char x : a.toCharArray())
//            Q.offer(x);
//
//        for (char x : b.toCharArray()) {
//            if (!Q.isEmpty()) {
//                if (x == Q.peek()) Q.poll();
//            } else {
//                ans = "YES";
//                break;
//            }
//        }
//
//        return ans;
    }


    public static void main(String[] args) {
        Queue_7 main = new Queue_7();
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        System.out.println(main.solution(a, b));
    }
}
