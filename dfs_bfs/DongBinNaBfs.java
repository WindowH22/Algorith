package dfs_bfs;
import java.util.*;
public class DongBinNaBfs {

    public static int n;
    public static int m;
    public static class point{
        public int x;
        public int y;

        point(int x, int y){
            this.x = x;
            this.y = y;
        }

        point(point p){
            this.x = p.x;
            this.y = p.y;
        }
    }
    public static Queue<point> q = new LinkedList<>();  //큐 생성
    public static int[][] graph;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dx = {-1, 1, 0, 0}; //상하좌우 행 움직임
        int[] dy = {0,0, -1, 1}; //상하좌우 열 움직임
        n = sc.nextInt(); //행 길이
        m = sc.nextInt(); //열 길이

        sc.nextLine();    //버퍼 지우기

        graph = new int[n][m];    //미로 생성

        for(int i=0;i<n;i++){
            String t = sc.nextLine();
            String[] t2 = t.split("");  //한글자씩 나누기
            for(int j=0;j<m;j++){

                graph[i][j] = t2[j].charAt(0)-'0';   //숫자로 변환하여 저장
            }
        }

        point start = new point(0, 0);

        q.add(start); //(0,0)부터 출발

        //큐가 빌 때까지 반복 수행
        while(!q.isEmpty()){
            point v = new point(q.poll()); //큐에서 꺼냄

            //상 하 좌 우 각각 거리 계산
            for(int i=0;i<4;i++){
                int nx = v.x+dx[i];
                int ny = v.y+dy[i];

                //범위 벗어나는 경우
                if(nx <0 || nx > n-1 || ny <0 || ny > m-1){

                }
                //괴물이 있는 경우(지나갈 수 없음)
                else if(graph[nx][ny]==0){

                }
                //방문하지 않았으면서 지나갈 수 있는 경우
                else if(graph[nx][ny]==1){
                    graph[nx][ny] = graph[v.x][v.y]+1;  //거리 계산
                    q.add(new point(nx, ny));   //큐에 현재 좌표 넣기
                }
            }

        }

        System.out.println(graph[n-1][m-1]);



    }
}