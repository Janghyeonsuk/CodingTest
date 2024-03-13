import java.util.*;
import java.util.stream.IntStream;


public class Test {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        List<Character> list = new ArrayList<>();

        for(char c : my_string.toCharArray())
            list.add(c);

        for(int i = 0; i < indices.length; i++)
            list.remove(indices[i]);

        for(char c : list)
            answer += c;
        return answer;
    }
    public static void main(String[] args) {
        Test T = new Test();
        System.out.println(T.solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }

}
