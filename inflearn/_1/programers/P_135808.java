package inflearn._1.programers;

import java.util.Arrays;
import java.util.Scanner;

public class P_135808 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        P_135808 p = new P_135808();
        System.out.println(p.solution(k,m,score));

    }
}
