package inflearn._1.programers;

//최대공약수와 최소공배수
public class P_12940 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = gcd(n,m);
        int lcm = n*m/gcd;

        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }

    //유클리드 호제법
    public int gcd(int a, int b){
        if(b == 0 )return a;
        else return gcd(b, a%b);
    }

}
