package programmers.pcce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 공원 {
    public int solution(int[] mats, String[][] park) {
        int h = park.length;
        int w = park[0].length;

        List<Integer> matList = Arrays.stream(mats)
                .boxed()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        for (Integer size : matList) {
            for(int i = 0; i <= h - size; i++){
                for (int j = 0; j <= w - size; j++) {
                    if(check(park, i, j, size)) {
                        return size;
                    }
                }

            }
        }

        return -1;
    }

    private boolean check(String [][]park, int x, int y, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!park[i + x][j + y].equals("-1")) {
                    return false;
                }
            }

        }
        return true;
    }
}
