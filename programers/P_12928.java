package programers;

import java.util.ArrayList;

//약수의 합
public class P_12928 {
    public int solution(int n) {
        int answer = 0;

        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            if(n%i == 0){
                divisors.add(i);
            }
        }

        for(int i = 0 ; i<divisors.size(); i++){
            answer += divisors.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        P_12928 p = new P_12928();
        System.out.println(p.solution(12));
    }
}
