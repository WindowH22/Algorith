package programers.lv1;

import java.util.*;

public class P_92334 {
    public int[] solution(String[] id_list, String[] report, int k){
        int[] answer= new int[id_list.length];

        Map<String, Set<String>> map = new HashMap<>();

        // 이름, 횟수로 맵하나 더만들어서 신고되었는지 판단하기.
        Map<String,Integer> reportCount = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i],new HashSet<>());
            reportCount.put(id_list[i],0);
        }

        for (int i = 0; i <report.length ; i++) {
            String[] rep= report[i].split(" ");
            String reporter = rep[0];
            String receiver = rep[1];

            map.get(reporter).add(receiver);

        }

        //신고자들 이름을 검색해서 만약 k가 넘으면 카운트를 센다.
        for (int i = 0; i <id_list.length ; i++) {
            if(map.containsKey(id_list[i])){

                String[] strings = new String[map.get(id_list[i]).size()];
                map.get(id_list[i]).toArray(strings);

                for (int j = 0; j <strings.length ; j++) {

                    int count = reportCount.get(strings[j]) +1;
                    reportCount.replace(strings[j], count);

                }

            }
        }

        for (int i = 0; i <id_list.length ; i++) {
            if(map.containsKey(id_list[i])){

                String[] strings = new String[map.get(id_list[i]).size()];
                map.get(id_list[i]).toArray(strings);

                for (int j = 0; j <strings.length ; j++) {
                    if(reportCount.get(strings[j]) >= k){
                        answer[i]++;
                    }
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        P_92334 p = new P_92334();
        for(int i:p.solution(id_list,report,2)){
            System.out.println(i);
        }
    }
}
