package programers;

//시저 암호

public class P_12926 {
    public String solution(String s, int n) {
        String answer = "";

        char [] alphabets = s.toCharArray();

        // 대문자 65~90
        // 소문자 97~122
        for (int i = 0; i <alphabets.length ; i++) {
            if(65<=alphabets[i] && alphabets[i] <=90){

                if(91<=alphabets[i]+n){
                    answer += (char)(alphabets[i]+n-26);
                }else{
                    answer += (char)(alphabets[i]+n);
                }

            }
            else if(97<=alphabets[i] && alphabets[i] <=122){
                if(122<alphabets[i]+n){
                    answer += (char)(alphabets[i]+n-26);
                }
                else{
                    answer += (char)(alphabets[i]+n);
                }
            }
            else if(alphabets[i] == ' '){
                answer += ' ';
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        P_12926 p = new P_12926();
        System.out.println(p.solution("a",25));
    }
}
