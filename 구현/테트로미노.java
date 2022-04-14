package boj;
import java.util.Scanner;

/*
 * 20220414
 * lg cns코테 준비
 * ㅗ모양 빼구 다 DFS로 처리하기
 * 회전과 뒤집기하기위해서 백트래킹 처리
 */
public class 테트로미노 {
	static int N, M, max;
	static int cnt, sum;
	static int[][] map;
	static boolean[][] v;

	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		max = 0;

		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		v = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				v[i][j] = true;
				DFS(i, j, v, 1, map[i][j]);
				v[i][j] = false;
				check(i, j);
			}
		}

		System.out.println(max);

	}

	private static void DFS(int r, int c, boolean[][] v, int cnt, int sum) {
		if (cnt >= 4) {
			max = Math.max(max, sum);
			return;
		}

		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];

			if (nr >= 0 && nc >= 0 && nr < N && nc < M && !v[nr][nc]) {
				v[nr][nc] = true;
				DFS(nr, nc, v, cnt + 1, sum + map[nr][nc]);
				v[nr][nc] = false;
			}
		}
	}

	// ㅗ모양 따로 해주기
	private static void check(int x, int y) {
		int sum2 = 0;
		// 1. ㅜ
		if (x >= 0 && x + 1 < N && y >= 0 && y + 2 < M) {
			sum2 = map[x][y] + map[x][y + 1] + map[x][y + 2] + map[x + 1][y + 1];
			max = Math.max(max, sum2);
		}

		// 2. ㅏ
		if (x >= 0 && x + 2 < N && y >= 0 && y + 1 < M) {
			sum2 = map[x][y] + map[x + 1][y] + map[x + 2][y] + map[x + 1][y + 1];
			max = Math.max(max, sum2);
		}

		// 3. ㅗ
		if (x - 1 >= 0 && x < N && y >= 0 && y + 2 < M) {
			sum2 = map[x][y] + map[x][y + 1] + map[x][y + 2] + map[x - 1][y + 1];
			max = Math.max(max, sum2);
		}

		// 4. ㅓ
		if (x - 1 >= 0 && x + 1 < N && y >= 0 && y + 1 < M) {
			sum2 = map[x][y] + map[x][y + 1] + map[x - 1][y + 1] + map[x + 1][y + 1];
			max = Math.max(max, sum2);
		}
	}

}
