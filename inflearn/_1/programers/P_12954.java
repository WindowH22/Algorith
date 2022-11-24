package inflearn._1.programers;

public class P_12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long num = Long.valueOf(x);

        for (int i = 0; i <n ; i++) {
            answer[i] = num;
            num= num+x;
        }

        return answer;
    }

    public static void main(String[] args) {
        P_12954 p = new P_12954();

        System.out.println(p.solution(2,5).toString());
    }

}
