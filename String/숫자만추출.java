package String;

import java.util.Scanner;

public class 숫자만추출 {

    public int solution(String str){
        int answer = 0;
        char[] chars = str.toCharArray();

        for( char c : chars){
            if(c >= 48 && c <=57){
                answer = answer * 10 + (c - 48);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        숫자만추출 T = new 숫자만추출();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }
}
