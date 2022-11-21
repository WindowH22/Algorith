package programers;

public class P_12947 {
    public boolean solution(int x) {
        boolean answer = true;

        int num = 0;
        int y = x;

        while(x>0) {
            num += x % 10;
            x /= 10;
        }
        answer = y%num == 0 ? true : false;
        return answer;
    }
}
