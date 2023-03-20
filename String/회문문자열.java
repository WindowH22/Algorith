package String;

import java.util.Scanner;

public class 회문문자열 {

    public String solution(String str){
        String answer = "YES";
        char[] chars = str.toLowerCase().toCharArray();

        int lt = 0;
        int rt = chars.length-1;

        while(lt<rt){
            if(chars[lt] != chars[rt]) return "NO";
            lt++;
            rt--;
        }
        return  answer;
    }

    public static void main(String[] args) {
        회문문자열 T = new 회문문자열();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(T.solution(str));
    }
}
