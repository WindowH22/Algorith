package programers;

public class P_12924 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <n ; i++) {
            int sum = 0;
            for (int j = i; j <n ; j++) {
                sum = sum +j;
                if(sum ==n){
                    answer ++;
                }else if(sum>n){
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        P_12924 p = new P_12924();
        p.solution(15);
    }
}
