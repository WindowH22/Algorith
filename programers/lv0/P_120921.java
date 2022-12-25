package programers.lv0;

public class P_120921 {
    public int solution(String A, String B) {
        int answer = 0;
        String C = "";


        while(!A.equals(B)){
            char ch = A.charAt(A.length()-1);
            A = ch+A.substring(0,A.length()-1);
            answer ++;
            if(answer > A.length()){
                return -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        P_120921 p = new P_120921();
        System.out.println(p.solution("hello", "ohell"));
    }
}
