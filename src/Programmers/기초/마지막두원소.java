package Programmers.기초;

import java.util.*;
import java.util.stream.Collectors;


public class 마지막두원소 {
    public int[] solution(int[] num_list) {
        int lastFirst = num_list[num_list.length -1];
        int lastSecond = num_list[num_list.length -2];

        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());

        list.add(lastFirst - lastSecond > 0 ? lastFirst - lastSecond : lastFirst * 2);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
