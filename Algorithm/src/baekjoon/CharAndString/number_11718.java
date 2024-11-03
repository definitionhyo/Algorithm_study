package baekjoon.CharAndString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_11718 {

	public static void main(String[] args) throws IOException {
		
//		문제
//		입력 받은 대로 출력하는 프로그램을 작성하시오.
//
//		1) 입력
//		입력이 주어진다. 
//		1-1) 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
//		각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
//
//		2) 출력
//		입력받은 그대로 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		
		for(int i = 0; i < 100; i++) {
			String print = br.readLine();
			
			if(print != null) {
				System.out.println(print);
			} else {
				break;
			}
		}
		
	}

}
