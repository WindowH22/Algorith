package inflearn._1.programers;

import java.util.*;

public class P_12915 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i <strings.length ; i++) {
            arr.add(""+strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i <arr.size() ; i++) {
            answer[i] = arr.get(i).substring(1);
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        P_12915 p = new P_12915();
        String[] s = {"abce", "abcd", "cdx"};
        System.out.println(p.solution(s,2));
    }
}
