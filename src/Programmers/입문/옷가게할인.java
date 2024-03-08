package Programmers.입문;

public class 옷가게할인 {
    public int solution(int price) {
        return (int) (price >= 500000 ? price * 0.8 : price >= 300000 ? price * 0.9 : price >= 100000 ? price * 0.95 : price * 1.0);
    }
}
