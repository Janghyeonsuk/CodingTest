package Programmers.lv0;

import java.math.BigInteger;

public class 두수의합 {
    public String solution(String a, String b) {
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger sum = A.add(B);

        return sum.toString();
    }
}
