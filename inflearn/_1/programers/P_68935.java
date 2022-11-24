package inflearn._1.programers;

import java.util.ArrayList;
import java.util.Scanner;

//3진법 뒤집기
public class P_68935 {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> reverse = new ArrayList<>();

        while(n >0){
            reverse.add(n%3);
            n = n/3;
            System.out.println("n :"+n);
        }

        int number3 = 1;
        for (int i = reverse.size()-1; i >= 0; i--) {
            answer = reverse.get(i)*number3;
            number3 *= 3;
        }
        return answer;
    }

    public static void main(String[] args) {
        P_68935 p = new P_68935();

        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        System.out.println(p.solution(n));
    }
}
