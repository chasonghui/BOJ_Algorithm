package boj;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 코테대비 
 * 준비운동 PART1. 튼튼한 기본기
 * 백준 : 2309 일곱난쟁이
 * 20220424
 */
public class 일곱난쟁이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hobit = new int[9];
		for (int i = 0; i < 9; i++) {
			hobit[i] = sc.nextInt();
		}
		// 10C9
		combination(hobit, new int[7], 0, 0);

	}

	public static void combination(int[] hobbit, int[] sel, int idx, int k) {
		if (k == sel.length) {
			int total = 0;
			for (int i = 0; i < sel.length; i++) {
				total += sel[i];

			}
			if (total == 100) {
				Arrays.sort(sel);
				for (int i = 0; i < sel.length; i++) {
					System.out.println(sel[i]);
				}
				System.exit(0);
			}
			return;
		}
		// inductive part
		for (int i = idx; i < hobbit.length; i++) {
			sel[k] = hobbit[i];
			combination(hobbit, sel, i + 1, k + 1);
		}
	}
}
