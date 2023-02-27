package programers.lv1;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P_150370 {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {

        ArrayList<Integer> answer = new ArrayList<>();
        int[] todayDat = new int[3];

        String[] todayDate = today.split("\\.");

        for (int i = 0; i < todayDate.length; i++) {
            todayDat[i] = Integer.valueOf(todayDate[i]);
        }

        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i <terms.length ; i++) {
            String[] str = terms[i].split(" ");
            map.put(str[0],Integer.valueOf(str[1]));
        }

        for (int i = 0; i < privacies.length ; i++) {
            int[] dat = new int[3];

            String[] str = privacies[i].split(" ");
            String[] date = str[0].split("\\.");

            for (int j = 0; j <date.length ; j++) {
                dat[i] = Integer.valueOf(date[i]);
            }

            String type = str[1];

            if(map.containsKey(type)){
                dat[1] += map.get(type);
                if(dat[1] > 12){
                   dat[1] -= 12;
                   dat[0]++;
                }
            }

            // 검증
            if(todayDat[0] < dat[0]){
                // 해당 배열 번호 추가
                answer.add(i);
            }else if(todayDat[0] == dat[0] && todayDat[1] < dat[1]){
                // 해당 배열 번호 추가
                answer.add(i);
            }else if(todayDat[0] == dat[0] && todayDat[1] == dat[1] && todayDat[2] < dat[2]){
                answer.add(i);
            }


        }

        for(int i : answer){
            System.out.println(i+ " : "+ i);
        }

        return answer;
    }

    public static void main(String[] args) {
        P_150370 p  = new P_150370();

        String today ="2022.05.19";
        String[] terms ={"A 6", "B 12", "C 3"};
        String[] privacies ={"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        p.solution(today,terms,privacies);
    }
}
