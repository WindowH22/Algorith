package programers.lv3;

import org.junit.Assert;
import org.junit.Test;

public class P_43162 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];
        for (int i = 0; i <n ; i++) {
            if(!check[i]){
                dfs(computers,i,check);
                answer++;
            }
        }

        return answer;
    }

    private static boolean[] dfs(int[][] computers, int i, boolean[]check){
        check[i] = true;

        for (int j = 0; j <computers.length ; j++) {
            if(i != j && computers[i][j] == 1 && check[j]==false){
                check = dfs(computers,j,check);
            }
        }

        return check;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(2, solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        Assert.assertEquals(1, solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
    }

}
