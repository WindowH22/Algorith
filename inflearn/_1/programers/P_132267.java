package inflearn._1.programers;

import com.sun.jdi.LongValue;

public class P_132267 {
    public long solution(int a, int b, int n) {
        long cola =0;
        long longA= a;
        long longB = b;
        long longN = n;
        if(n<a){
            return 0;
        }
        while(n >=a){
            cola += (n/a)*b ;
            n = n/a*b+n%a;
        }

        return cola;
    }
}
