package programers.devMatching;

public class _3 {
    public int solution(String[] subway,int start, int end){
        int answer = 0;
        int[] route = new int[subway.length+1];
        int[] station;


        for (int i = 0; i <subway.length+1 ; i++) {
            route[i] = i;
            String[] k = subway[i].split(" ");
            for (int j = 0; j <k.length ; j++) {
                System.out.println(Integer.parseInt(k[i]));
            }


        }

        return answer;
    }

    public static void main(String[] args) {
        _3  p = new _3();

        String[] subway = {"1 2 3 4 5"};
        System.out.println(p.solution(subway,1,4));
    }
}
