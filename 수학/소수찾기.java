package boj;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 코테대비 
 * 준비운동 PART1. 튼튼한 기본기
 * 백준 : 1978 소수찾기
 * 20220424
 */
public class 소수찾기 {
	/*
	 * 1부터 N-1까지 나눠보고 나눠지면 소수아님
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			boolean isPrime = true;
			for (int j = 2; j < num; j++) {
				if(num%j==0) isPrime = false;
			}
			if(num==1) isPrime = false;
			if(isPrime==true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
