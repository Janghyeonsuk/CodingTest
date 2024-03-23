package Programmers.lv0;

import java.time.LocalDate;

public class 날짜비교하기 {
    public int solution(int[] date1, int[] date2) {

        LocalDate a = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate b = LocalDate.of(date2[0], date2[1], date2[2]);

        if (a.isBefore(b))
            return 1;
        else
            return 0;
    }
}
