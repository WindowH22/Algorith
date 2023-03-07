package programers.lv2;

import programers.lv1.P_92334;

public class P_70129 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        //이진 변환 횟수
        int binaryCnt = 0;
        //0의 개수
        int zeroCnt = 0;

        while(s.equals("1")){
            zeroCnt += zeroCnt(s);
            s = remove0(s);
            int c = s.length();
            binaryCnt++;

            s = Integer.toBinaryString(c);
        }

        answer[0] = binaryCnt;
        answer[1] = zeroCnt;
        return answer;
    }

    public String remove0(String s){
        String answer = "";

        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) == '1') answer += s.charAt(i);
        }
        return answer;
    }

    public int zeroCnt(String s){
        int answer = 0;

        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) == '0') answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        P_70129 p = new P_70129();
        p.solution("110010101001");

    }
}
