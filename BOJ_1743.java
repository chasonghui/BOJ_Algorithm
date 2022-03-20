import java.util.Arrays;
import java.util.Scanner;

/*
20220320
백준 : 1743 음식물피하기 실1
 */
public class BOJ_1743 {
    static int N,M;//통로의 세로가로길이
    static int K;//음식물 쓰레기의 개수

    static int[][] map;//통로
    static boolean[][] v;//방문확인

    static int cnt =1;//붙어있는 쓰레기

    //사방탐색
    static int[] dr = {-1,1,0,0};
    static int[] dc ={0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        v = new boolean[N][M];
        K = sc.nextInt();
        for (int i = 0; i <K ; i++) {
            map[sc.nextInt()-1][sc.nextInt()-1] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j]==1&&v[i][j]==false){
                    Recursive(i,j);
                    cnt++;
                }
            }
        }

        int trash[] = new int[cnt];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j]!=0) trash[map[i][j]]++;
            }
        }

        int max=-1;
        for (int i = 0; i < trash.length; i++) {
            if(trash[i]>max) max = trash[i];

        }
        System.out.println(max);

    }


    private static void Recursive(int r,int c) {
        v[r][c] = true;
        map[r][c] = cnt;
        for (int d = 0; d < 4; d++) {
            int nr = r+dr[d];
            int nc = c+dc[d];
            //경계값 체크
            if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
                if (map[nr][nc] == 1 && !v[nr][nc]) {
                    Recursive(nr, nc);
                }
            }

        }

    }

    public static void print(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}
