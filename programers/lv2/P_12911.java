package programers.lv2;

// 다음 큰 숫자
public class P_12911 {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);

        while(true){
            int k = ++n;
            if(count == Integer.bitCount(k)){
                answer = k;
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        P_12911 p = new P_12911();
        System.out.println(p.solution(78));
    }
}
