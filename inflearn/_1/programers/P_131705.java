package inflearn._1.programers;

public class P_131705 {
    public int solution(int[] number) {
        int answer = 0;
        int count = 0;

        for (int i = 0; i <number.length ; i++) {
            for (int j = i+1; j <number.length ; j++) {
                for (int k = j+1; k <number.length ; k++) {
                    if(number[i] +number[j]+number[k] ==0){
                        count++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        P_131705 p = new P_131705();
        int[] number = {-2,3,0,2,-5};
        System.out.println(p.solution(number));
    }
}
