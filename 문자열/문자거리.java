package inflean;

import java.util.Scanner;
/*
 * 20220717
 * 왼e기준 거리 구하기
 * 오른쪽e기준 거리 구하기
 * 최솟값 갱신.
 */
public class 문자거리 {

	public static int[] solution(String s, char t) {
		int[] answer = new int[s.length()];
		int p = 1000;
		//왼쪽에서부터 떨어진 거리
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==t) {
				p=0;
				answer[i] =p;
			}else {
				p++;
				answer[i] = p;
			}
		}
		//오른쪽에서부터 떨어진 거리
		p=1000;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==t) {
				p=0;
			}else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char c = sc.next().charAt(0);
		
		for(int x: solution(str,c)) {
			System.out.print(x+" ");
		}
		
	}
}
