package programers.lv1;

public class P_142086 {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        answer[0] = -1;

        for (int i = 1; i < s.length(); i++) {
            int x = s.lastIndexOf(s.substring(i,i+1),i-1);

            if(x != -1){
                answer[i] = i-x;
            }else {
                answer[i] = x;
            }
        }

        for(int i : answer){
            System.out.println(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        P_142086 p = new P_142086();
        p.solution("banana");
    }
}
