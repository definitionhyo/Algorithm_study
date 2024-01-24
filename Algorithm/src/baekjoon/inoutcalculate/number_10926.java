package baekjoon.inoutcalculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_10926 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더를 통해 받음
		String id = br.readLine(); // readLine을통해 받아온 문자열을 id에 저장
		System.out.println( id + "??!" ); // id 뒤에 ??! 추가
		br.close();
		
	}

}
