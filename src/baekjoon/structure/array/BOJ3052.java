package baekjoon.structure.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer>list = new ArrayList<Integer>();

        int count = 0;

        for( int i = 0; i <10; i++){
            int input = sc.nextInt();


            if(!list.contains(input%42)){
                list.add(input%42);
                count++;
            }
        }
        System.out.println(count);
    }
}