package baekjoon.inoutcalculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_2588 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더를 통해 받음
		int a = Integer.parseInt(br.readLine()); // a에 첫번째 세자리 정수 저장
		int b = Integer.parseInt(br.readLine()); // b에 두번째 세자리 정수 저장
		
		System.out.println( a * ( b % 10 )); // b % 10으로 일의자리 수를 구해서 계산
		System.out.println( a * ( b % 100 / 10 )); // b % 100으로 백의자리수를 버리고 그 수를 10으로 나눠 원래 숫자의 십의 자리수를 구해서 계산
		System.out.println( a * ( b / 100 )); // /을 통해 백의 자리 수를 구해서 계산
		System.out.println( a * b );
		
		br.close();
		
	}

}
