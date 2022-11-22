package programers;

import java.util.ArrayList;
import java.util.Comparator;

public class P_12910 {

    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%divisor ==0){
                answer.add(arr[i]);
            }
        }
        if(answer.size() ==0){
            ArrayList<Integer> zero = new ArrayList<>();
            zero.add(-1);
            return zero;
        }

        answer.sort(Comparator.naturalOrder());
        return answer;
    }

    public static void main(String[] args) {
        P_12910 p = new P_12910();
        int[] arr = {5,9,7,10};
        System.out.println(p.solution(arr,5));
    }
}
