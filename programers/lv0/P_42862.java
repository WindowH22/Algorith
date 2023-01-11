package programers.lv0;

import java.util.Arrays;

public class P_42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);


        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for (int i = 0; i <lost.length ; i++) {
            for (int j = 0; j <reserve.length ; j++) {
                if(lost[i] == reserve[j]){
                    answer ++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 도난당한 학생에게 체육복을 빌려주는 경우
        for (int i = 0; i <lost.length ; i++) {
            for (int j = 0; j <reserve.length  ; j++) {
                if( (lost[i] -1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        int [] lost = {2, 4};
        int [] reserve = {1, 3, 5};
        int n = 5;

        P_42862 p = new P_42862();
        System.out.println(p.solution(n,lost,reserve));
    }
}
