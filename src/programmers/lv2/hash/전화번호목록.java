package programmers.lv2.hash;

import java.util.*;

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        HashMap<String, Boolean> phoneMap = new HashMap<>();

        for(String phone : phone_book){
            phoneMap.put(phone, true);
        }
        Arrays.sort(phone_book);

        for(String p : phone_book){
            for(int i = 1; i <p.length(); i++){
                String tmp = p.substring(0, i);
                if(phoneMap.containsKey(tmp))
                    return false;
            }
        }
        return true;
    }

    public boolean solution2ㄴ(String[] phone_book) {
        HashMap<String, Boolean> phoneMap = new HashMap<>();

        for(String phone : phone_book){
            phoneMap.put(phone, true);
        }
        Arrays.sort(phone_book);

        for(String p : phone_book){
            for(int i = 1; i <p.length(); i++){
                String tmp = p.substring(0, i);
                if(phoneMap.containsKey(tmp))
                    return false;
            }
        }
        return true;

    }
}


