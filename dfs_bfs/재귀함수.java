package dfs_bfs;

public class 재귀함수 {


    public static void main(String[] args) {
        재귀함수 T = new 재귀함수();
        T.DFS(3);
    }

    private void DFS(int n) {
        if(n == 0){
            return;
        }else{
            System.out.println(n);
            DFS(n-1);
        }
    }
}
