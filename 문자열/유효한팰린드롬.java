package inflean;

import java.util.Scanner;

/*
 * 20220708 
 * replaceAll 정규식 사용
 */
public class 유효한팰린드롬 {

	public static String solution(String s) {
		String answer = "NO";
		//대문자 A부터 Z에 속하지 않는것들 빈문자로 대치
		s = s.toUpperCase().replaceAll("[^A-Z]","");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer = "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(solution(str));
	}

}
