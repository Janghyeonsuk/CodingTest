import java.util.*;
import java.util.stream.IntStream;


public class Test {

    public String solution(String myString) {
        String answer = "";
        int idx = myString.lastIndexOf("i");

        for(int i = 0; i < idx; i++)
            answer += "i";

        answer += myString.substring(idx);

        return answer;
    }
    public static void main(String[] args) {
        Test T = new Test();

    }

}