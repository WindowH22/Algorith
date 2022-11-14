package programers;

import java.util.ArrayList;
import java.util.Scanner;


public class P_120813 {
    public ArrayList<Integer> solution(int n) {
        int[] index = new int[n];
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < index.length ; i++) {
            index[i] = i+1;
        }

        for (int i = 0; i <index.length ; i++) {
            if(index[i]%2 != 0){
                answer.add(index[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        P_120813 s = new P_120813();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(s.solution(n));


    }
}
