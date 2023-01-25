package programers.lv0;

public class P_120848 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 10 ; i++) {
            if(n >= factorial(i)){
                answer = i;
                continue;
            }else{
                break;
            }
        }
        return answer;
    }

    int factorial(int num){
        if(num>1) return num*factorial(num-1);
        return num;
    }

    public static void main(String[] args) {
        P_120848 p = new P_120848();
        System.out.println(p.solution(3628800));
    }
}
