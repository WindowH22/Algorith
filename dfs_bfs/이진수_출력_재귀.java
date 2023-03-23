package dfs_bfs;

public class 이진수_출력_재귀 {

    public static void main(String[] args) {
        이진수_출력_재귀 T = new 이진수_출력_재귀();
        T.DFS(11);
    }

    private void DFS(int n) {
        if(n == 0) return;
        else{
            DFS(n/2);
            System.out.print(n%2+ "");
        }
    }
}
