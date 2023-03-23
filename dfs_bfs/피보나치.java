package dfs_bfs;

public class 피보나치 {
    public static void main(String[] args) {
        피보나치 T = new 피보나치();
        System.out.println(T.DFS(10));
    }

    private int DFS(int n){
        if(n == 1) return 1;
        else if(n==2) return 1;
        else return DFS(n-2)+DFS(n-1);
    }
}
