package inflean;

import java.util.Scanner;
//indexOf : 젤 처음에 발견한 문자의 위치 리턴
public class 중복문자제거 {

	public static String solution(String str) {
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i))==i) {
				answer+=str.charAt(i);
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
