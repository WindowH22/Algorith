package programers.lv1;

public class P_140108 {

    public int solution(String s) {
        int answer = 0;
        int num = 0;
        char[] chars = s.toCharArray();

        //첫번째 글자
        char ch = chars[0];

        for (int i = 0; i <chars.length ; i++) {
            if(ch == chars[i]){
                num++;
            }else{
                num--;
            }

            if(num == 0 && i !=0){
                answer++;
                if(i == chars.length-1) {
                    break;
                }
                ch = chars[i+1];
            }

            //마지막 글자 혼자 남을 경우
            if(i == chars.length-1 && num !=0 ){
                answer++;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        P_140108 p = new P_140108();
        System.out.println(p.solution("abracadabra"));
    }
}
