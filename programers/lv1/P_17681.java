package programers.lv1;

public class P_17681 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[]  strings1 = new String[n];
        String[]  strings2 = new String[n];

        //이진법 만들기
        for (int i = 0; i <n ; i++) {
            strings1[i] = toBinary(n,arr1[i]);
            strings2[i] = toBinary(n,arr2[i]);
        }

        // 이차원 배열 선언
        char[][] ch1= new char[n][n];
        char[][] ch2= new char[n][n];

        // 배열에 값넣기
        for (int i = 0; i <strings1.length ; i++) {
            char[] chars1= strings1[i].toCharArray();
            char[] chars2= strings2[i].toCharArray();
            for (int j = 0; j <chars1.length ; j++) {
                if(chars1[j] == '1' && chars2[j] =='0'){
                    chars2[j] = '1';
                }
            }
            strings2[i] = String.valueOf(chars2);
        }

        for (int i = 0; i <strings2.length ; i++) {
            answer[i] = toShop(strings2[i]);
            System.out.println(answer[i]);
        }

        return answer;
    }

    String toBinary(int n,int num){
        String answer = "";
        int i = 1;

        while(num>=1){
            int k = num%2;
            answer = k+ answer;
            num = num/2;
            n--;
        }
        for (int j = n; j >0 ; j--) {
            answer = "0"+answer;
        }

        return answer;
    }

    String toShop(String arr){

        String answer = "";

        for (int i = 0; i <arr.length() ; i++) {
            if(arr.charAt(i) == '1'){
                answer += "#";
            }else{
                answer += " ";
            }
        }

        return answer;
    }

    // 이진법으로 배열을 나열하고
    // 1이면 넘어가고
    // 0이면 값을 넣어준다.
    // 1갯수만큼 '#'출력

    public static void main(String[] args) {
        P_17681 p = new P_17681();
        System.out.println(p.toBinary(5,1));
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        System.out.println(p.solution(5,arr1,arr2));
    }
}
