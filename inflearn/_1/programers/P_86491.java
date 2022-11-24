package inflearn._1.programers;

public class P_86491 {
    public int solution(int[][] sizes) {

        int width = 0;
        int vertical = 0;

        // 가로 값이 더 크게 만든다.
        for (int i = 0; i <sizes.length ; i++) {
            for (int j = 1; j <sizes[0].length ; j++) {
                if(sizes[i][j-1]<sizes[i][j]){
                    int n = sizes[i][j-1];
                    sizes[i][j-1] = sizes[i][j];
                    sizes[i][j] = n;
                }
            }
        }
        // 가로 값 가장 큰거 ,세로 값 가장 큰거 구한다.
        for (int i = 0; i <sizes.length ; i++) {
            if(width < sizes[i][0]){
                width = sizes[i][0];
            }
            if(vertical < sizes[i][1]){
                vertical = sizes[i][1];
            }
        }
        // 곱한다.
        int answer = width*vertical;
        return answer;
    }

    public static void main(String[] args) {
        P_86491 p = new P_86491();
        int[][] size = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(p.solution(size));
    }
}
