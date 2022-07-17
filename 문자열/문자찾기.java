package inflean;

import java.util.Scanner;

/*
 * 20220622
 */
public class 문자찾기 {
//toUpperCase, toLowerCase
	// for문 2종류
	public static int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();// 대소문자 구문안하니까 하나로 통일해주기
		t = Character.toUpperCase(t);
		// 향상된 for문
		// string을 문자 배열로 바꿈 toCharArray()
		for (char x : str.toCharArray()) {
			if (x == t)
				answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		System.out.print(solution(str, c));
	}

}
