package boj;

import java.util.Scanner;

/*
 * 코테대비 
 * 준비운동 PART1. 튼튼한 기본기
 * 백준 : 3460 이진수
 * 20220424
 */
public class 이진수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 1; i <= tc; i++) {
			int N = sc.nextInt();
			String str = "";
			while (N>0) {
				if (N % 2 == 1) {
					N = N / 2;
					str += "1";
					
				} else {
					N = N / 2;	
					str += "0";
				}
			}
			// System.out.println(str);
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '1') {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

	}

}
