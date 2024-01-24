package baekjoon.inoutcalculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_1001 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더를 통해 A,B 입력
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 토크나이저를 통해 br로 받아온 값을 구분자 띄어쓰기로 나눔
		int A = Integer.parseInt(st.nextToken()); // 첫번째 토큰을 받아와 Int로 변환 후 A에 저장
		int B = Integer.parseInt(st.nextToken()); // 두 "
		System.out.println ( A - B ); // A - B 출력
		br.close();
		
	}

}
