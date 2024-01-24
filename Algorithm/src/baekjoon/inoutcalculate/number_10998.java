package baekjoon.inoutcalculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_10998 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 리더를 통해 받음
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 구분자기준으로 나눔
		int A = Integer.parseInt(st.nextToken()); // 토큰을 받아와 A에 저장
		int B = Integer.parseInt(st.nextToken()); // B에 저장
		System.out.println( A * B ); // 출력
		br.close();
	}

}
