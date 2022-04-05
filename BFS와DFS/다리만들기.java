package ad;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 20220405
 * 백준 : 2146 다리만들기
 * 1. 마을 구분하기
 * 2. 섬끼리의 최단 거리찾기BFS
 */

public class 다리만들기 {
	static int N, cnt = 1, min = 987654321;
	static int map[][];
	static boolean v[][];

	// 사방탐색
	static int dr[] = { -1, 1, 0, 0 };
	static int dc[] = { 0, 0, -1, 1 };

	// 최단거리 찾을 좌표
	static class Node {
		int y, x, dist;

		public Node(int y, int x, int dist) {
			super();
			this.x = x;
			this.y = y;
			this.dist = dist;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();// 지도의 크기
		map = new int[N][N];
		v = new boolean[N][N];// 방문배열

		// 맵 입력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		// 사방탐색 재귀
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				// 방문한적없고 마을이면
				if (map[i][j] == 1 && !v[i][j]) {
					recursive(i, j);
					cnt++;// 다음마을로 이동
				}
			}
		}
//		print();



		// 섬끼리 최단거리
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				// 0:바다 이므로 마을일때만
				if (map[i][j] != 0) {
					bfs(i, j);
				}
			}
		}

		System.out.println(min);
	}

	// 섬끼리의 최단거리를 구행
	private static void bfs(int y, int x) {
		//초기화좀 해 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		v = new boolean[N][N];
		Queue<Node> Q = new LinkedList<>();
		Q.add(new Node(y, x, 0));
		v[y][x] = true;

		while (!Q.isEmpty()) {
			Node node = Q.poll();

			// 최솟값보다 긴 다리있으면 끝내기
			if (node.dist >= min) {
				return;
			}

			for (int d = 0; d < 4; d++) {
				int nr = node.y + dr[d];
				int nc = node.x + dc[d];
				// 경곗값확인 + 방문안함
				if (nr >= 0 && nc >= 0 && nr < N && nc < N && !v[nr][nc]) {
					// 바다일때
					if (map[nr][nc] == 0) {
						v[nr][nc] = true;
						Q.add(new Node(nr, nc, node.dist + 1));
					}
					// 다른섬에 도착시 최소값 갱신
					else if (map[nr][nc] != map[y][x]) {
						min = Math.min(min, node.dist);
					}
				}
			}
		}
	}

	// 섬 구분해주기 1,2,3
	private static void recursive(int i, int j) {
		map[i][j] = cnt;// 방문섬 표시
		v[i][j] = true;// 방문체크

		// 사방탐색
		for (int d = 0; d < 4; d++) {
			int nr = i + dr[d];
			int nc = j + dc[d];

			// 경곗값
			if (nr >= 0 && nc >= 0 && nr < N && nc < N) {
				if (map[nr][nc] == 1 && !v[nr][nc]) {
					recursive(nr, nc);
				}
			}
		}

	}

	private static void print() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}
