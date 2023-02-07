package programers.lv1;

public class P_77884 {
    public int solution(int left, int right) {
        int answer = 0;
        int num = left;

        int [] numArr = new int[right - left +1];

        //약수의 개수
        for (int i = 0; i <numArr.length ; i++) {
            numArr[i] = num;
            num++;

            int n = numArr[i];
            int measureCnt = 0;
            for (int j = 1; j <=numArr[i] ; j++) {
                if(n%j == 0){
                    measureCnt++;
                }
            }
            if(measureCnt%2 != 0){
                numArr[i] = -numArr[i];
            }
            answer += numArr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        P_77884 p = new P_77884();
        System.out.println(p.solution(13,17));
    }
}
