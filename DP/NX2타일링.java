package sejun;

import java.util.Scanner;

/*
 * 백준 :  11726 2xn타일링
 * 점화식 = d[i] = d[i-2]+d[i-1]
 */
public class NX2타일링 {
	static int N;
	static int[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		dp = new int[1001];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= N; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
		}
		System.out.println(dp[N]);

	}

}
