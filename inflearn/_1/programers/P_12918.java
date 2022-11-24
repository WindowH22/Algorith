package inflearn._1.programers;

//문자열 다루기 기본
public class P_12918 {

    public boolean solution(String s) {
        boolean answer = true;

        if((s.length() == 4 || s.length() ==6)){

            // 이 포문을 다 통과하면 true
            char[] chars = s.toCharArray();

            for (int i = 0; i <chars.length ; i++) {
                if(chars[i]<'0' || chars[i]>'9'){
                    answer = false;
                }
            }
        }else{
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        P_12918 p =  new P_12918();
        System.out.println(p.solution("12a3"));


    }
}
