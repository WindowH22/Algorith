package programers;

// 문자열을 정수로 바꾸기
public class P_12925 {
    public int solution(String s) {
        int answer = 0;

        char[] chars = s.toCharArray();

        int index = 1;

        for (int i = chars.length-1; i >= 0 ; i--) {
            if(chars[i] == '+'){
                answer = answer* 1;
            }
            else if(chars[i] == '-'){
                answer = answer * (-1);
            }
            else{
                answer += (chars[i]-48)*index;
                index *= 10;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        P_12925 p = new P_12925();
        System.out.println(p.solution("-1234"));
    }
}
