package inflearn._1.programers;

import java.util.ArrayList;

//자연수 뒤집어 배열로 만들기
public class P_12932 {

    public ArrayList<Long>solution(long n) {
        ArrayList<Long> answer = new ArrayList<>();

        for (long j = n; j >0  ; j /=10) {
            answer.add(j%10);
        }
        return answer;
    }

    public static void main(String[] args) {

        P_12932 p = new P_12932();
        System.out.println(p.solution(12040));
    }
}
