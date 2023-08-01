package level1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String solution(String text, String skip, int index) {
        String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" }; // 25

        List<String> skipAlpha = new ArrayList<>();
        List<Integer> skipAlphaIdx = new ArrayList<>();
        List<String> textAlpha = new ArrayList<>();
        List<Integer> textAlphaIdx = new ArrayList<>();
        String textword = "";
        String skipword = "";

        // skip 알파벳
        for (int i = 0; i < skip.length(); i++) {
            skipword = skip.substring(i, i + 1);
            skipAlpha.add(skipword);
            // System.out.println(skipAlpha.get(i));
        }

        // skip 알파벳 번호
        for (int i = 0; i < skipAlpha.size(); i++) {
            for (int j = 0; j < alpha.length; j++) {
                if (skipAlpha.get(i).equals(alpha[j])) {
                    skipAlphaIdx.add(j);
                }
            }
            // System.out.println(skipAlphaIdx.get(i));
        }

        // 텍스트 알파벳
        for (int i = 0; i < text.length(); i++) {
            textword = text.substring(i, i + 1);
            textAlpha.add(textword);
            // System.out.println(textAlpha.get(i));
        }

        // 텍스트 알파벳 번호
        for (int i = 0; i < textAlpha.size(); i++) {
            for (int j = 0; j < alpha.length; j++) {
                if (textAlpha.get(i).equals(alpha[j])) {
                    textAlphaIdx.add(j);
                }
            }
            // System.out.println(textAlphaIdx.get(i));
        }

        // 알파벳 번호 스킵
        List<Integer> answerIdx = new ArrayList<>();
        for (int i = 0; i < textAlphaIdx.size(); i++) {
            int idx = textAlphaIdx.get(i);
            for (int j = 0; j < index; j++) {
                if (skipAlphaIdx.contains(idx + 1)) {
                    idx++;
                }
                idx++;
                if (idx > 25) {
                    idx = idx - 26;
                }
            }
            answerIdx.add(idx);
        }

        // 스킵 적용 후 숫자를 알파벳으로 변환
        List<String> answerAlpha = new ArrayList<>();
        for (int i = 0; i < answerIdx.size(); i++) {
            answerAlpha.add(alpha[answerIdx.get(i)]);
        }

        // 결과문 출력
        String answer = "";
        for (int i = 0; i < answerAlpha.size(); i++) {
            answer = answer + answerAlpha.get(i);
        }

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
