package boj;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 코테대비 
 * 준비운동 PART1. 튼튼한 기본기
 * 백준 : 10870 피보나치수5
 * 20220424
 */
public class 피보나치수5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] fibo = new int[N + 1];
		if (N == 0) {
			fibo[0] = 0;
		} else if (N == 1) {
			fibo[0] = 0;
			fibo[1] = 1;
		} else if (N >= 2) {
			fibo[0] = 0;
			fibo[1] = 1;
			for (int i = 2; i <= N; i++) {
				fibo[i] = fibo[i - 2] + fibo[i - 1];
			}
		}
		System.out.println(fibo[N]);

	}

}
