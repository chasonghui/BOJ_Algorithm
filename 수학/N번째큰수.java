package boj;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 코테대비 
 * 준비운동 PART1. 튼튼한 기본기
 * 백준 : 2693 N번째 큰수
 * 20220424
 */
public class N번째큰수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			int[] A = new int[10];
			for (int j = 0; j < 10; j++) {
				A[j] = sc.nextInt();
			}
			Arrays.sort(A);
			System.out.println(A[7]);
		}
		
	}
}
