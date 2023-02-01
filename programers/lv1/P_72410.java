package programers.lv1;

public class P_72410 {
    public String solution(String new_id) {
        // 3자 이상 15자 이하
        // 알파벳 소문자, 숫자, 뺴기, 밑즐,마침표 문자만 사용할 수 있다.
        // 마침표는 처음과 끝에 사용할수 없으며 연속으로 사용할 수 없다.

        String answer = "";

        // 1단계
        new_id = new_id.toLowerCase();
        String level2 = "";
        // 2단계
        for (int i = 0; i <new_id.length() ; i++) {
            if(
                    (new_id.charAt(i)>='a' && new_id.charAt(i)<='z') ||
                    (new_id.charAt(i)>='0' && new_id.charAt(i)<='9') ||
                    new_id.charAt(i) == '-' || new_id.charAt(i) == '_' || new_id.charAt(i) == '.'
            ){
                level2 += new_id.charAt(i);
            }
        }
       new_id = level2;

        String level3 = "";
        if(new_id.charAt(0) != '.' || new_id.length()==1) level3 += new_id.charAt(0);
        //3단계
        for (int i = 1; i <new_id.length() ; i++) {
            if(new_id.charAt(i-1)=='.'&&new_id.charAt(i)!='.'){
                level3 += "."+new_id.charAt(i);
            }else if(new_id.charAt(i) !='.'){
                level3 += new_id.charAt(i);
            }
        }
        new_id = level3;

        // 4단계
        if (new_id.charAt(0)=='.') {
            if(new_id.length() == 1){
                new_id = "";
            }else {
            new_id = new_id.substring(1);
            }
        }


        // 5단계
        if(new_id.length() == 0) return "aaa";
        // 6단계
        else if(new_id.length() >= 16) {
            new_id = new_id.substring(0,15);
            if(new_id.charAt(new_id.length()-1) == '.'){
                new_id = new_id.substring(0,14);
            }
        }
        // 7단계
        if(new_id.length() <= 2){
           while(new_id.length() !=3){
               new_id += new_id.charAt(new_id.length()-1);
           }
        }

        answer = new_id;
        return answer;
    }

    public static void main(String[] args) {
        P_72410 p = new P_72410();
        System.out.println(p.solution("=.="));
    }
}
