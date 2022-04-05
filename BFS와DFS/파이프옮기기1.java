package ad;

import java.util.Scanner;

/*
 * 20220405
 * 백준 : 17070 파이프옮기기 1
 */
public class 파이프옮기기1 {

	static int N, ans;
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];

		// 맵 입력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		DFS(0, 1, 0);
		System.out.println(ans);

	}

	private static void DFS(int x, int y, int d) {
		// 끝점에 도달하면 종료
		if (x == N-1 && y == N-1) {
			ans++;
			return;
		}
		switch (d) {
		case 0:// 가로일때
			if (y + 1 < N && map[x][y + 1] == 0) { // 오른쪽
				DFS(x, y + 1, 0);
			}
			break;
		case 1:// 세로일때
			if (x + 1 < N && map[x + 1][y] == 0) { // 아래
				DFS(x + 1, y, 1);
			}
			break;
		case 2:// 대각선일때
			if (y + 1 < N && map[x][y + 1] == 0) { // 오른쪽
				DFS(x, y + 1, 0);
			}

			if (x + 1 < N && map[x + 1][y] == 0) { // 아래
				DFS(x + 1, y, 1);
			}
			break;
		}
		// 공통: 대각선
		if (y + 1 < N && x + 1 < N && map[x][y + 1] == 0 && map[x + 1][y] == 0 && map[x + 1][y + 1] == 0) {
			DFS(x + 1, y + 1, 2);
		}

	}

}
