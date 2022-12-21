package programers.lv2;

public class P_12945 {

    public int solution(int n){
        int[] answer = new int[n+1];

        for (int i = 0; i <=n; i++) {
            if(i==0) answer[i] =0;
            else if(i== 1) answer[i] = 1;
            else{
                int sum = answer[i-2]+ answer[i-1];
                answer[i] = sum %1234567;
            }
        }
        return answer[n];
    }


/*  시간초과(재귀)
    public int solution(int n) {
        return fibonacci(n);
    }

    public int fibonacci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return (fibonacci(n-2) + fibonacci(n-1)) % 1234567;
    }*/
}
