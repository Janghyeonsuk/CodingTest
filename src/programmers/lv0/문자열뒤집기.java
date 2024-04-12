package Programmers.lv0;

public class 문자열뒤집기 {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string.substring(s,e+1));

        sb.reverse();

        return my_string.substring(0,s) + sb + my_string.substring(e+1);
    }
}
