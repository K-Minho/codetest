package level1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String solution(String text, String skip, int index) {
        String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

        List<String> skipAlpha = new ArrayList<>();
        List<String> textAlpha = new ArrayList<>();
        String textword = "";
        String skipword = "";

        for (int i = 0; i < skip.length(); i++) {
            skipword = skip.substring(i, i + 1);
            skipAlpha.add(skipword);
            // System.out.println(skipAlpha.get(i));
        }

        for (int i = 0; i < text.length(); i++) {
            textword = skip.substring(i, i + 1);
            textAlpha.add(textword);
            // System.out.println(textAlpha.get(i));
        }

        for (int i = 0; i < textAlpha.size(); i++) {
            for (int j = 0; j < index; j++) {

            }
        }

        String answer = "answer";
        return answer;
    }
}

public class question1_solution {
    public static void main(String[] args) {
        String answer = Solution.solution("aukks", "wbqd", 5);

        // happy 가 나오면 성공
        System.out.println(answer);
    }
}
