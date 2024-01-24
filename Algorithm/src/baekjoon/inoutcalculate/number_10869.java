package baekjoon.inoutcalculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_10869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 리더를 통해 스페이스바로 받음
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 구분자 공백을 기준으로 토큰화
		int A = Integer.parseInt(st.nextToken()); // A에 첫번째로 토큰 받아옴
		int B = Integer.parseInt(st.nextToken()); // B에 두번쨰로 받아옴
		
		System.out.println( A + B );
		System.out.println( A - B );
		System.out.println( A * B );
		System.out.println( A / B );
		System.out.println( A % B );
		
		br.close();
	}

}
