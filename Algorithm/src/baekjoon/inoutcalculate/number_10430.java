package baekjoon.inoutcalculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_10430 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더를 통해 정수 A B C 받아옴
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");  // 문자열을 스페이스바 기준으로 토큰화함 
		int A = Integer.parseInt(st.nextToken()); // A에 저장
		int B = Integer.parseInt(st.nextToken()); // B에 저장
		int C = Integer.parseInt(st.nextToken()); // C에 저장
		
		System.out.println( ( A + B ) % C );
		System.out.println( ( ( A % C ) + ( B % C ) ) % C);
		System.out.println( ( A * B ) % C );
		System.out.println( ( ( A % C ) * ( B % C ) ) % C );
		
		br.close();
	}

}
