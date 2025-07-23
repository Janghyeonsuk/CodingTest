package programmers.pcce;

public class 지폐접기 {

    public int solution(int[] wallet, int[] bill) {
        int cnt = 0;

        while (!fit(wallet, bill)) {
            if (bill[0] >= bill[1]) bill[0] /= 2;
            else bill[1] /= 2;
            cnt++;
        }

        return cnt;
    }

    public boolean fit(int[] wallet, int[] bill) {
        return (wallet[0] >= bill[0] && wallet[1] >= bill[1]
                || wallet[1] >= bill[0] && wallet[0] >= bill[1]);
    }

}
