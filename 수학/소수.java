package boj;

import java.util.Scanner;

/*
 * 코테대비 
 * 준비운동 PART1. 튼튼한 기본기
 * 백준 : 2581 소수
 * 20220425
 */
public class 소수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
	
		int sum =0;
		int min =Integer.MAX_VALUE;
		for (int i = M; i <=N; i++) {
			boolean isPrime = true;
			
			if(i ==1) isPrime = false;
			
			for (int j = 2; j < i; j++) {
				if(i%j==0) {
					isPrime = false;
				}
			}
			
			if(isPrime) {
				sum+=i;
				if(min>i) min = i;
			} 
		}
		if(min == Integer.MAX_VALUE) {
			System.out.println("-1");
		}else {
			System.out.println(sum);
			System.out.println(min);
		}


	}

}
