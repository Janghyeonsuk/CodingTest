package Programmers.lv0;

public class 문자열여러번뒤집기 {
    public String solution(String my_string, int[][] queries) {
        char[] ch = my_string.toCharArray();

        for(int[] query : queries){
            int lt = query[0];
            int rt = query[1];
            while(lt < rt){
                char temp = ch[lt];
                ch[lt++] = ch[rt];
                ch[rt--] = temp;
            }
        }

        return new String(ch);
    }
}
