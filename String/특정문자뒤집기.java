package String;

import java.util.Scanner;

public class 특정문자뒤집기 {
    public static void main(String[] args) {
        특정문자뒤집기 T = new 특정문자뒤집기();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(T.solution1(str));

    }

    // 일일히 하나씩 해보는 방법
    public String solution1(String str){
        String answer = "";
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while(lt<rt){
            // 영어 알파벳인 경우만 뒤집는다.
            if(!Character.isAlphabetic(chars[lt])) lt ++;
            else if(!Character.isAlphabetic(chars[rt])) rt--;
            else{
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt ++;
                rt --;
            }
        }
        answer = String.valueOf(chars);

        return answer;
    }

}
