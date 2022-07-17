package inflean;

import java.util.Scanner;

/*
 * 회문문자열(펠린드롬)
 * 하나씩비교하기
 * String builder로 뒤집어서 같은지 비교하기.
 * Stringbuilder.reverse().toString 사용, 
 * equalsIgnoreCase : 대소문자 상관안하고 비교
 */

public class 회문문자열 {
	public static String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		int len = str.length();
		for (int i = 0; i < len/2; i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) {
				return "NO";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(solution(str));
	}

}
