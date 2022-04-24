package boj;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 코테대비 
 * 준비운동 PART1. 튼튼한 기본기
 * 백준 : 10818 최소,최대
 * 20220424
 */
public class 최소최대 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		int max = arr[0];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max) max = arr[i];
		}

		int min = arr[0];
		for (int i = 1; i < N; i++) {
			
			if(arr[i]<min) min = arr[i];
		}
		
		System.out.println(min+" "+max);
		

	}

}
