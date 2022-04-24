package boj;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 코테대비 
 * 준비운동 PART1. 튼튼한 기본기
 * 백준 : 2460 지능형기차
 * 20220424
 */
public class 지능형기차 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] train = new int[10][2];
		int max = 0;
		int total = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {
				train[i][j] = sc.nextInt();
				if (j == 1) {
					total += train[i][j];
					if (total > max)
						max = total;
				} else {
					total -= train[i][j];
				}
			}
		}
		System.out.println(max);

	}

}
