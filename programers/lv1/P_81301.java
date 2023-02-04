package programers.lv1;

import java.util.HashMap;
import java.util.Map;

public class P_81301 {
    public int solution(String s) {
        int answer = 0;

        // map으로 정리하기
        Map<String,String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        StringBuilder result = new StringBuilder("");
        StringBuilder word = new StringBuilder("");

        for (int i = 0; i <s.length() ; i++) {
            word.append(s.charAt(i));
            if(map.containsKey(String.valueOf(word))){
                result.append(map.get(String.valueOf(word)));
                word.setLength(0);
            }else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                result.append(s.charAt(i));
                word.setLength(0);
            }
        }

        answer = Integer.valueOf(String.valueOf(result));

        // 받고 키가 있다면 값을 내뱉어라?


        return answer;
    }

    public static void main(String[] args) {
        P_81301 p = new P_81301();
        System.out.println(p.solution("one4seveneight"));
    }
}
