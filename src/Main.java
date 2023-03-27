import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strList = new ArrayList<>();

        String line;

        int count = 0;
        while ((line = in.readLine()) != null) {
            if (line.isEmpty() || count > 100) {
                break;
            } else {
                strList.add(line);
                count++;
            }
        }

        for (String s : strList) {
            System.out.println(s);
        }
    }
}