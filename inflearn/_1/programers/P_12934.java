package inflearn._1.programers;

//정수 제곱근 판별
public class P_12934 {
    public long solution(long n) {
        long answer = 0;

        double sqrt = Math.sqrt(n);

        if(sqrt % 1 == 0  ){

            answer = (long)((sqrt+1)*(sqrt+1));
        }else{
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        P_12934 p = new P_12934();
        System.out.println(p.solution(3));
    }
}
