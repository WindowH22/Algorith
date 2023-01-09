package dfs_bfs;

import java.io.*;
import java.util.Scanner;

public class DongBinNaDfs {
    public static int[][] arr;
    public static int N; // 행
    public static int M; // 렬

    public static boolean dfs(int i, int j) {

        if (i < 0 || i >= N || j < 0 || j >= M) {
            return false;  ////얼음 틀 벗어나는 범위
        }

        if (arr[i][j] == 0) {
            arr[i][j] = 1;// 해당 노드 방문처리

            ////상하좌우 방문(재귀적으로 처리)
            dfs(i + 1, j);
            dfs(i - 1, j);
            dfs(i, j + 1);
            dfs(i, j - 1);

            return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int answer=0;
        System.out.println("얼음 틀 세로 길이:");
        N = sc.nextInt();
        System.out.println("얼음 틀 가로 길이:");
        M = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        arr = new int[N][M];

        // 2차원 리스트의 맵 정보 입력 받기
        for (int i = 0; i < N ; i++) {
            String text = sc.nextLine();
            for (int j = 0; j <M ; j++) {
                arr[i][j] = text.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < M; j++) {
                if(dfs(i,j)) answer++;
            }

        }
        System.out.println(answer);
    }
}
