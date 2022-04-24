package boj;

import java.util.Scanner;

/*
 * 코테대비 
 * 준비운동 PART1. 튼튼한 기본기
 * 20220424
 */
public class 약수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				cnt++;
				if (cnt == K) {
					System.out.println(i);
					System.exit(0);
				}
					
			}
		}
		System.out.println("0");

	}

}
