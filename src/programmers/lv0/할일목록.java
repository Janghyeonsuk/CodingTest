package Programmers.lv0;

import java.util.*;

public class 할일목록 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i])
                list.add(todo_list[i]);
        }

        return list.stream()
                .toArray(String[]::new);
    }
}
