package programers;

//가운데 글자 가져오기
public class P_12903 {

    public String solution(String s) {
        String answer = "";

        char [] a = s.toCharArray();

        if(s.length()%2 ==0){
            answer = s.charAt(-1+s.length()/2)+String.valueOf(s.charAt(s.length()/2));
        }else{
            answer = String.valueOf(s.charAt(s.length()/2));
        }
        return answer;
    }
}
