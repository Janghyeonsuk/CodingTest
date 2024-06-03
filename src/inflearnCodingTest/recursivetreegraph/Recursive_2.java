package inflearnCodingTest.recursivetreegraph;

import java.util.Scanner;

public class Recursive_2 {
    //2. 이진수 출력(재귀)
    public void recursive(int n){
        if(n == 0)
            return;
        else{
            recursive(n / 2);
            System.out.print(n % 2);
        }
    }

    public void solution(int n){
        recursive(n);
    }

    public static void main(String[] args) {
        Recursive_2 main = new Recursive_2();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        main.recursive(n);
    }
}
