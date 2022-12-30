package programers.lv0;

public class P_120816 {

    public int solution(int slice, int n) {
        int answer = 1;
        while(slice*answer<n){
            answer++;
        }
        return answer;
    }

}
