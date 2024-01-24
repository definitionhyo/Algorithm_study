package baekjoon.inoutcalculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_1008 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 리더기를 통해 받아옴
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 구분자를 통해 띄어쓰기로 구분
//		int A = Integer.parseInt(st.nextToken()); // A에 받아옴
//		int B = Integer.parseInt(st.nextToken()); // B에 받아옴
//		Double C = (double) (A / B); // A / B 를 double로 강제 형변환
		// ------------------ 토큰으로 나눌때 int로 말고 더블로 나누기
		Double A = Double.parseDouble(st.nextToken()); // parseDouble형태로 Double형으로 A에 받아옴
		Double B = Double.parseDouble(st.nextToken()); // B에 받아옴
		System.out.println( A / B ); //
		br.close(); // 종료
	}

}
