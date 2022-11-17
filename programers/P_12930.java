package programers;

import java.util.Arrays;

//이상한 문자 만들기
public class P_12930 {

    public String solution(String s){

        String answer = "";
        String[] st = s.split("");
        int idx = 0;

        //1.입력받는 문자열 길이만큼 반복
        for(int i=0; i<st.length; i++){
            //1-1.공백이 나오면 인데스값 초기화해서 단어 별로 처리
            if(st[i].equals(" ")){
                idx=0;
            }
            //1-2.짝수 인데스일 경우
            else if(idx %2 == 0){
                //대문자로 변환
                st[i] = st[i].toUpperCase();
                //다음 인덱스로 넘어가기
                idx++;
            }
            //1-3.
            else{//홀수 인덱스일 경우
                //소문자로 변환
                st[i] = st[i].toLowerCase();
                //다음 인덱스로 넘어가기
                idx++;
            }
            //1-4.바꾼 값을 answer에 하나씩 더하기
            answer += st[i];
        }

        return answer;

    }

    public static void main(String[] args) {
        P_12930 p = new P_12930();

        System.out.println(p.solution("  tRy hello  WORLD    "));

    }
}

// 스트링 배열에 바뀐 값을 넣고 넣은 값을  공백하나로 나열