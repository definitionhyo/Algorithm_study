package baekjoon.inoutcalculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_11382 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력받음
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 구분자 공백을 기준으로 토큰화
//		int a = Integer.parseInt(st.nextToken()); // 토큰화 후 형변환 후 저장
//		int b = Integer.parseInt(st.nextToken()); // "
//		int c = Integer.parseInt(st.nextToken()); // "
		long a = Long.parseLong(st.nextToken()); // 토큰화 후 형변환 후 저장
		long b = Long.parseLong(st.nextToken()); // 토큰화 후 형변환 후 저장
		long c = Long.parseLong(st.nextToken()); // 토큰화 후 형변환 후 저장
		
		// Numberformat 오류 발생 : 조건에 1 <= A, B, C <= 10^12 
		// int형을 초과할수도 있음 -> long으로
		
		System.out.println( a + b + c ); // 출력 
		br.close(); // 종료

	}

}
