package programers;

public class P_82612 {
    public long solution(int price, int money, int count) {

        long total = 0;

        for (int i = 1; i <= count ; i++) {
            total += price*i;
        }
        long answer = -1;

        answer = total - money;
        if(answer<=0){
            return 0;
        }
        return answer;
    }
}
