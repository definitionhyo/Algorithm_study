package baekjoon.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_1330 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 받음
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 문자열을 공백을 구분자로 토큰화 함
		int A = Integer.parseInt(st.nextToken()); // 첫번째 토큰화 한 문자열을 정수로 형변환 후 A에 저장
		int B = Integer.parseInt(st.nextToken()); // B에 저장
		
		// 조건문 시작
		if (A > B) { // A > B 경우
			System.out.println(">"); // > 출력
		} else if (A < B){ // A < B 경우
			System.out.println("<"); // < 출력
		} else { // 나머지 즉 A == B 경우
			System.out.println("=="); // == 출력
		}
		
		br.close();

	}

}
