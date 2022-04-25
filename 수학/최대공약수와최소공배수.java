package boj;
import java.util.Scanner;

/*
 * 코테대비 
 * 준비운동 PART1. 튼튼한 기본기
 * 백준 : 2609 최대공약수와 최소공배수
 * 20220424
 */
public class 최대공약수와최소공배수 {
	/*
	 * 유클리드 호제법 이용 
	 * GCD(a,b) = GCD(B,A%B) 
	 * if A%B = 0 -> GCD = B 
	 * else GCD(B,A%B)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int gcd = gcd(a, b);
		System.out.println(gcd);
		System.out.println(a * b / gcd);
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

}
