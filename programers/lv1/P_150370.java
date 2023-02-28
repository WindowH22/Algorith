package programers.lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class P_150370 {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {

        ArrayList<Integer> answer = new ArrayList<>();
        String todayDat = "";
        String[] todayDate = today.split("\\.");

        for (int i = 0; i < todayDate.length; i++) {
            todayDat += todayDate[i];
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
                dat[j] = Integer.valueOf(date[j]);
            }

            String type = str[1];

            if(map.containsKey(type)){

                dat[1] += map.get(type);


                if(dat[1] > 12 && dat[1]%12 !=0) {

                    dat[0] = dat[0] + dat[1] / 12;
                    dat[1] = dat[1] % 12;
                }else if(dat[1] > 12 && dat[1]%12 ==0){
                    dat[0] = dat[0] + (dat[1]-12) / 12;
                    dat[1] = 12;
                }

            }

            String infoDate = "";

            for(int k: dat){
                if(k<10) infoDate += "0" + k;
                else{
                    infoDate += k;
                }

            }

            if(Integer.valueOf(infoDate) <= Integer.valueOf(todayDat)) answer.add(i+1);

        }

        return answer;
    }

    public static void main(String[] args) {
        P_150370 p  = new P_150370();

        String today ="2020.01.01";
        String[] terms ={"Z 3", "D 5"};
        String[] privacies ={"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        p.solution(today,terms,privacies);
    }
}
