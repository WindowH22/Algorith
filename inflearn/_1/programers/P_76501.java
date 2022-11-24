package inflearn._1.programers;

public class P_76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length ; i++) {
            answer += absolutes[i]*(signs[i]? 1:-1);
        }

        return answer;
    }
}
