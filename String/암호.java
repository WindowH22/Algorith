package String;

import java.util.Scanner;

public class 암호 {
    public String solution(int x, String str) {
        String answer = "";

        for (int i = 0; i < x; i++) {
            String tmp = str.substring(0, 7).replace('#','1').replace('*','0');
            char ch =(char) Integer.parseInt(tmp,2);
            answer += String.valueOf(ch);
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        암호 T = new 암호();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }
}
