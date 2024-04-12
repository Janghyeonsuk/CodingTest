package inflearnCodingTest.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Queue_8 {
    // 8. 응급실
    public int solution(int n, int m, int[] list) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();

        for (int i = 0; i < n; i++)
            Q.offer(new Person(i, list[i]));

        while (!Q.isEmpty()) {
            Person tmp = Q.poll();

            for (Person x : Q) {
                if (x.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m)
                    return answer;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Queue_8 main = new Queue_8();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(n, m, arr));
    }
}
