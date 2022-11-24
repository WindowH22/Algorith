package inflearn._1.programers;

import java.util.ArrayList;

//자릿수 더하기
public class P_12931 {
    public int solution(int n) {
        int answer = 0;

        while (true){
            answer += n%10;
            if(n<10){
                break;
            }
            n = n/10;
        }
        return answer;
    }
}
