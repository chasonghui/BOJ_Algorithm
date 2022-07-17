package inflean;

import java.util.Scanner;

/*
 * 인덱스를 활용한 문자뒤집기
 * String.valueOf(s)
 */
public class 특정문자뒤집기 {

	public static String solution(String str) {
		String answer = "";
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length() - 1;
		while (lt < rt) {
			if (!Character.isAlphabetic(s[lt])) {
				lt++;
			} else if (!Character.isAlphabetic(s[rt])) {
				rt--;
			} else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		// 배열을 String화
		answer = String.valueOf(s);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
