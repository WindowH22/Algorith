package programers;

//정수 제곱근 판별
public class P_12934 {
    public long solution(long n) {
        long answer = 0;

        long sqrt = (long)Math.sqrt(n);

        if(sqrt % 1 == 0  ){
            answer = (sqrt+1)*(sqrt+1);
        }else{
            answer = -1;
        }


        return answer;
    }
}
