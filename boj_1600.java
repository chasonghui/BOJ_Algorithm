/*
백준: 말이 되고픈 원숭이 골드4
알고수업2 1일차 20220330
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj_1600 {
    // 상하좌우
    static int[] dx = {1,-1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    // 말
    static int[] jumpx = {-2, -2, 2, 2, 1, -1, 1, -1};
    static int[] jumpy = {1, -1, 1, -1, 2, 2, -2, -2};


    // k, 가로, 세로
    static int K, W, H;
    // 맵
    static int[][] map;
    // 방문배열: (x,y,남은 말움직임 횟수)
    static boolean[][][] visit;

    //말숭이
    static class Monkey{
        int x;
        int y;
        int cnt;
        int k;

        Monkey(int x, int y, int cnt, int k){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.k = k;//말로 움직인 횟수
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();//말처럼 움직일 수 있는 횟수
        W = sc.nextInt();//가로
        H = sc.nextInt();//세로

        //세로 가로 크기
        map = new int[H][W];
        //방문 배열
        visit = new boolean[H][W][K+1];

        //map입력받기
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        //방문표시
        visit[0][0][0] = true;
        Queue<Monkey> q = new LinkedList<Monkey>();

        q.add(new Monkey(0,0,0,K));

        while(!q.isEmpty()) {
            Monkey now = q.poll();
            int nowX = now.x;
            int nowY = now.y;
            int cnt = now.cnt;
            int nowK = now.k;

            // 끝일때
            if(nowX == W-1 && nowY == H-1) {
                System.out.println(cnt);
                return;
            }
            // 경계값
            if(nowX >= W || nowY >= H || nowX < 0 || nowY < 0) continue;
            // 벽인경우
            if(map[nowY][nowX] == 1) continue;
            //방문했으면
            if(visit[nowY][nowX][nowK]) continue;

            //방문처리
            visit[nowY][nowX][nowK] = true;

            //사방탐색
            for(int d = 0; d < 4; d++) {
                int nextX = nowX + dx[d];
                int nextY = nowY + dy[d];

                q.add(new Monkey(nextX, nextY, cnt+1,  nowK));

            }
            //사방탐색 끝나고
            if(nowK == 0) continue;

            //말처럼뛸때
            for(int d = 0; d < 8; d++) {
                int nextX = nowX + jumpx[d];
                int nextY = nowY + jumpy[d];

                q.add(new Monkey(nextX, nextY, cnt+1, nowK-1));

            }


        }
        System.out.println("-1");
        return;

    }



}
