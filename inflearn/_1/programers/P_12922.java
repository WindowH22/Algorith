package inflearn._1.programers;

public class P_12922 {
    public String solution(int n) {
        String answer = "";

        for (int i = 0; i < n ; i++) {
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }

        return answer;
    }
}
