package programers;

import java.util.HashMap;
import java.util.Map;

public class P_118666 {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        int[] score = new int[8];

        char[] type = {'R','T','C','F','J','M','A','N'};

        for (int i = 0; i <type.length ; i++) {
            map.put(type[i],i);
        }

        for (int i = 0; i <survey.length ; i++) {
            char [] chars = survey[i].toCharArray();
            switch (choices[i]){
                case 1 : score[map.get(chars[0])]+= 3;
                         break;
                case 2 : score[map.get(chars[0])]+= 2;
                         break;
                case 3 : score[map.get(chars[0])]+= 1;
                         break;
                case 4 : break;
                case 5 : score[map.get(chars[1])]+= 1;
                         break;
                case 6 : score[map.get(chars[1])]+= 2;
                         break;
                case 7 : score[map.get(chars[1])]+= 3;
                         break;
            }
        }
        String answer = "";

        for (int i = 0; i <score.length ; i+=2) {
            if(score[i]>score[i+1]){
                answer += type[i];
            }else if(score[i]<score[i+1]){
                answer += type[i+1];
            }else{
                answer += type[i];
            }
        }

        return answer;
    }
}
