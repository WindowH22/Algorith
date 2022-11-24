package inflearn._1.programers;

public class P_12943 {
    public int solution(int num) {

        long n = num;
        int count = 0;

        while(n != 1){
            if(n%2 == 0 ){
                n = n/2;
                System.out.println(n);
            }else{
                n = (n*3)+1;
                System.out.println(n);
            }
            count ++;
            if(count >=500){
                return -1;
            }
        }


        return count;

    }
    public static void main(String[] args){
        P_12943 s = new P_12943();
        System.out.println(s.solution(6));
    }
}
