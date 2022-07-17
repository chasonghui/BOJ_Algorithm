package inflean;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1번방법
 * Stringbuiler의 reverse, toString
 * String으로 하면 뭐하나할때마다 새로운객체가 생성됨. 
 * 근데 Stringbuiler는 뭔가할때마다 하나만든객체로 하기때문에 가벼움
 * 2번방법
 * 일일히 하나씩 뒤집기
 */
public class 단어뒤집기 {

	public static ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer =new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		for (String x : solution(N, str)) {
			System.out.println(x);
		}

	}

}
