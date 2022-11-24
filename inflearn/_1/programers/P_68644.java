package inflearn._1.programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class P_68644 {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(numbers);

        for (int i = 0; i <numbers.length ; i++) {

            for (int j = i+1; j <numbers.length ; j++) {
                int n = numbers[i]+numbers[j];
                if(answer.contains(n)){
                    continue;
                }
                answer.add(n);
            }
        }

        answer.sort(Comparator.naturalOrder());
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        P_68644 p = new P_68644();
        System.out.println(p.solution(numbers));
    }
}
