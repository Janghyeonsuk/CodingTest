package programmers.lv0;

public class 모스부호1 {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] morseString = letter.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String s : morseString)
            for (int i = 0; i < morse.length; i++)
                if (s.equals(morse[i])) sb.append(Character.toString(i + 'a'));

        return sb.toString();
    }
}
