package programers;

import java.util.Arrays;
import java.util.HashMap;

public class P_12915 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        char[] chars = new char[strings.length];
        HashMap<Character,String> hash = new HashMap<>();

        for (int i = 0; i <strings.length ; i++) {
            //자리에 해당하는 글자
            chars[i] =strings[i].charAt(n);
            hash.put(chars[i],strings[i]);
        }
        Arrays.sort(chars);

        for (int i = 0; i <chars.length ; i++) {
            answer[i] = hash.get(chars[i]);
            System.out.println("answer:"+answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        P_12915 p = new P_12915();
        String[] s = {"abce", "abcd", "cdx"};
        System.out.println(p.solution(s,2));
    }
}
