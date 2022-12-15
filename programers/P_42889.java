package programers;

import java.util.*;

public class P_42889 {
    // N은 1이상 500 이하의 자연수
    // N = 전체스테이지의 개수
    // stages = 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열
    // 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
    public int[] solution(int N, int[] stages) {
        HashMap<Integer,Double> map = new HashMap<>();

        int[] userFailCnts = new int[N + 2];    // 각 스테이지에 머물러 있는 플레이어 수
        int[] userTotalCnts = new int[N + 1];   // 각 스테이지에 도달한 플레이어 수

        // 스테이지 별 머물러있는 플레이어 수 카운트
        for(int stage : stages){
            userFailCnts[stage]++;
        }

        // 스테이지 별 도달한 플레이어 수 카운트
        userTotalCnts[N] = userFailCnts[N]+userFailCnts[N+1];
        for(int i = N-1; i >= 1; i--){
            userTotalCnts[i] = userFailCnts[i] + userTotalCnts[i+1];
        }

        //스테이지 별 실패율 계산
        for(int i = 1 ; i<userTotalCnts.length; i++){
            if (userFailCnts[i] == 0 || userTotalCnts[i] == 0) {
                map.put(i, 0.0);
            }else{
                map.put(i, (double)userFailCnts[i] / userTotalCnts[i]);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(o1,o2) -> Double.compare(map.get(o2),map.get(o1)));

        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        P_42889 p = new P_42889();
        p.solution(5,new int[]{2,1,2,6,2,4,3,3});
    }
}

