package baekjoon.structure.deque;

import java.io.*;
import java.util.*;

public class BOJ10866 {
    static Deque<Integer> deque = new LinkedList<>();

    static void push_front(int value){
        deque.addFirst(value);
    }

    static void push_back(int value){
        deque.addLast(value);
    }

    static int pop_front(){
        if(deque.isEmpty())
            return - 1;

        return deque.removeFirst();
    }

    static int pop_back(){
        if(deque.isEmpty())
            return - 1;

        return deque.removeLast();
    }

    static int size(){
        return deque.size();
    }

    static int empty(){
        return deque.isEmpty() ? 1 : 0;
    }

    static int front(){
        if(deque.isEmpty())
            return - 1;

        return deque.peekFirst();
    }

    static int back(){
        if(deque.isEmpty())
            return - 1;

        return deque.peekLast();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int last = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push_front":
                    last = Integer.parseInt(st.nextToken());
                    push_front(last);
                    break;
                case "push_back":
                    last = Integer.parseInt(st.nextToken());
                    push_back(last);
                    break;
                case "pop_front":
                    sb.append(pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(pop_back()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}
