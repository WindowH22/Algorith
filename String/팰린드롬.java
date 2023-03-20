package String;

import java.util.Scanner;

public class 팰린드롬 {
    public static void main(String[] args) {
        팰린드롬 T = new 팰린드롬();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(T.solution(str));
    }

    public String solution(String str){
        String answer = "NO";
        str= str.toUpperCase().replaceAll("[^A-Z]", ""); // 대문자A-Z가 아니면 빈문자열로 해버려라
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)){
            answer ="YES";
        }
        return answer;
    }
}
