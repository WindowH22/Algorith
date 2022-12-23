package programers;

import java.util.*;

public class PCCP_121683 {
    public String solution(String input_string) {
        String answer = "";
        List<Character> solo = new ArrayList<>();
        Set<Character> alpha = new HashSet<>();

        // 중복되지않는 character 받기
        for (int i = 1; i <input_string.length() ; i++) {
            if(input_string.charAt(i-1) != input_string.charAt(i)){
                solo.add(input_string.charAt(i-1));

            }
            if(i == input_string.length()-1){
                solo.add(input_string.charAt(i));
            }
        }

        for (Character c : solo) {
            // 두개 이상이면 set를 통해 중복되지 않게 값을 받는다.
            if(solo.indexOf(c) != solo.lastIndexOf(c)){
                alpha.add(c);
            }
        }

        if(alpha.isEmpty()) return "N";

        //set은 정렬이 되지 않기 때문에 list를 통해 정렬한다.
        List<Character> list = new ArrayList<>(alpha);
        list.sort(Comparator.naturalOrder());

        for(Character c : list){
            answer += c;
        }

        return answer;
    }

    public static void main(String[] args) {
        PCCP_121683 p = new PCCP_121683();
        System.out.println(p.solution("eeddee"));
    }
}
