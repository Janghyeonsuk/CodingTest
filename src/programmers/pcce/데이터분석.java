package programmers.pcce;

import java.util.Arrays;
import java.util.Map;

public class 데이터분석 {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> index = Map.of(
                "code", 0,
                "date", 1,
                "maximum", 2,
                "remain", 3
        );

        int extIdx = index.get(ext);
        int sortIdx = index.get(sort_by);

        return Arrays.stream(data)
                .filter(d -> d[extIdx] < val_ext)
                .sorted((a, b) -> Integer.compare(a[sortIdx], b[sortIdx]))
                .toArray(int[][]::new);
    }
}