package programers;

//핸드폰 번호 가리기
public class P_12948 {
    public String solution(String phone_number) {
        String answer = "";
        String showNum = phone_number.substring(phone_number.length()-4);

        for (int i = 0; i <phone_number.length()-4 ; i++) {
            answer += "*";
        }

        answer += showNum;

        return answer;
    }
}
