package inflean;

import java.util.Scanner;

/*
 * 20220717
 * 1) 아스키코드 
 * 48 ~ 57 : '0' ~ '9' 
 * 2) string, parseInt 사용
 */
public class 숫자만추출 {

//	public static int solution(String s) {
//		int answer = 0;
//		for(char x: s.toCharArray()) {
//			if(x>=48&&x<=57) {
//				answer= answer*10+(x-48);
//			}
//		}
//		return answer;
//	}
	public static int solution(String s) {
		String answer = "";
		for(char x: s.toCharArray()) {
			if(Character.isDigit(x)) answer+=x;
		}
		return Integer.parseInt(answer);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(solution(str));

	}

}
