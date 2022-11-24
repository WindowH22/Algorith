package inflearn._1.programers;

import java.util.Scanner;

public class P_87389 {
    public int solution(int n){
        int answer = 3;

        while(true){
            if(n%answer == 1){
                break;
            }
            answer ++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        P_87389 p = new P_87389();
        System.out.println(p.solution(n));
    }
}
