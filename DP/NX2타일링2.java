package sejun;

import java.util.Scanner;

/*
 *  백준 : 11727 2*n타일링2
 *  점화식 = d[i]=d[i-1]+2*d[i-2]
 */
public class NX2타일링2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] dp = new int[1001];
		
		dp[1]=1;
		dp[2]=3;
		
		for (int i = 3; i <=N; i++) {
			dp[i] = (dp[i-1]+2*dp[i-2]);
		}
		System.out.println(dp[N]);
	}
}
