package programers.lv2;

public class P_12951 {
    public String solution(String s) {
        String answer = "";

        String[] temp = s.toLowerCase().split("");

        boolean space = true;

        for(String ss: temp){
            // space가 true 면 대문자로, 아니면 그냥그대로 사용
            answer += space ? ss.toUpperCase() : ss;
            // 공백이 오면 space를 true 아니면 false
            space = ss.equals(" ") ? true : false;
        }
        return answer;

    }

    public static void main(String[] args) {
        P_12951 p = new P_12951();
        System.out.println(p.solution("3people Unfollowed me"));
    }
}
