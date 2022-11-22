package programers;

public class P_77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 최고, 최저 세팅할 2의 배열길이로 선언
        int[] answer = new int[2];

        int match_cnt = 0 ;
        int zero_cnt = 0;

        for (int i = 0; i <lottos.length ; i++) {
            if(lottos[i] == 0 ){
                zero_cnt++;
            }
            for (int j = 0; j <win_nums.length ; j++) {
                if(win_nums[j] == lottos[i]){
                    match_cnt++;
                    break;
                }
            }
        }

        // 최고 순위 세팅
        answer[0] = Math.min(7-(zero_cnt+match_cnt),6);
        // 최저 순위 세팅
        answer[1] = Math.min(7-match_cnt,6);

        return answer;
    }
}
