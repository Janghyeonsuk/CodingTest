package programmers.lv0;

public class 문자열이몇번등장하는지세기 {
    public int solution(String myString, String pat) {
        int cnt = 0;

        for(int i = 0; i < myString.length(); i++)
            if(myString.substring(i).startsWith(pat))
                cnt++;

        return cnt;
    }
}
