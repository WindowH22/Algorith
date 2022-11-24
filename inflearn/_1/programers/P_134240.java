package inflearn._1.programers;

import java.util.ArrayList;
import java.util.Comparator;

public class P_134240 {
    public String solution(int[] food) {
        String answer = "";
        int size = 0;
        int[] index = {1,2,3};

        for (int i = 1; i <food.length ; i++) {
            size += food[i];
        }

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 1; i <food.length ; i++) {

            int k = food[i]/2;

            for (int j = 0; j < k ; j++) {
                a.add(i);

            }

        }

        a.sort(Comparator.naturalOrder());
        for (int i = 0; i <a.size() ; i++) {
            answer += a.get(i);
        }

        answer += "0";

        a.sort(Comparator.reverseOrder());
        for (int i = 0; i <a.size() ; i++) {
            answer += a.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        P_134240 pr= new P_134240();

        int [] food = {1,3,4,5};
        pr.solution(food);
    }
}
