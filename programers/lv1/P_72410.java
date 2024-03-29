package programers.lv1;

public class P_72410 {
    public String solution(String new_id) {
        // 3자 이상 15자 이하
        // 알파벳 소문자, 숫자, 뺴기, 밑즐,마침표 문자만 사용할 수 있다.
        // 마침표는 처음과 끝에 사용할수 없으며 연속으로 사용할 수 없다.

        String answer = "";

        // 1단계
        String step1 = new_id.toLowerCase();

        // 2단계
        char[] step1_arr = step1.toCharArray();
        StringBuilder step2 = new StringBuilder();
        for (char c : step1_arr) {
            if(
                    (c>='a' && c<='z') ||
                    (c>='0' && c<='9') ||
                    c == '-' || c == '_' || c == '.'
            ){
                step2.append(c);
            }
        }

        //3단계
        String step3 = step2.toString().replace("..",".");
        while (step3.contains("..")) step3 = step3.replace("..",".");



        // 4단계
        String step4 = step3;
        if(step4.length() > 0){
            if(step4.charAt(0) =='.'){
                step4 = step4.substring(1,step4.length());
            }
        }

        if(step4.length() > 0){
            if(step4.charAt(step4.length()-1) == '.'){
                step4 = step4.substring(0,step4.length()-1);
            }
        }

        // 5단계
        String step5 = step4;
        if(step5.equals("")) step5 = "a";

        // 6단계

        String step6 = step5;
        if(step6.length() >= 16) {
            step6 = step6.substring(0,15);
            if(step6.charAt(step6.length()-1) == '.'){
                step6 = step6.substring(0,step6.length()-1);
            }
        }


        // 7단계
        StringBuilder step7 = new StringBuilder(step6);

        if(step7.length() <= 2){
            char last = step7.charAt(step7.length() -1 );
           while(step7.length() <3){
               step7.append(last);
           }
        }

        answer = String.valueOf(step7);
        return answer;
    }

    public static void main(String[] args) {
        P_72410 p = new P_72410();
        System.out.println(p.solution("=.="));
    }
}
