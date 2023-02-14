package programers.lv1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class P_138477 {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            q.add(score[i]);
            if (q.size() > k) {
                q.poll();
            }
            answer[i] = q.peek();
        }
        return answer;
    }

    public static void main(String[] args) {
        P_138477 p = new P_138477();
        int [] score = {10, 100, 20, 150, 1, 100, 200};

        System.out.println(p.solution(3,score));
    }
}
