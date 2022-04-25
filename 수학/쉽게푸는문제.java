package boj;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 코테대비 
 * 준비운동 PART1. 튼튼한 기본기
 * 백준 : 1292 쉽게푸는문제
 * 20220425
 */
public class 쉽게푸는문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[] numbers = new int[1000+1];
		int cnt=0;
		for (int i = 1; i <= B; i++) {
			for (int j = 0; j < i; j++) {
				numbers[cnt] = i;
				cnt++;
				if(cnt>=1000) {
					//System.out.println("넘엇다고");
					i =B;
					break;
				}
			}
		}
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i]+" ");
//		}
		int sum =0;
		for (int i = A-1; i <= B-1; i++) {
			sum+=numbers[i];
		}

		System.out.println(sum);

	}

}
