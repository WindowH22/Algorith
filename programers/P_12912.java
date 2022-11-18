package programers;

import java.util.ArrayList;

public class P_12912 {
    //두 정수 사이의 합
    public long solution(int a, int b) {
        long answer = 0;

        if(a-b<0){
            while (a<b){
                answer += a;
                a++;
            }

        }
        else if(a-b>0)
        {
            while(a>b){
                answer += b;
                b++;
            }
        }

        answer += a;

        return answer;
    }
}
