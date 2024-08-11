package baekjoon.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_10818 {

	public static void main(String[] args) throws IOException {

//		문제 
//		N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
//		1)입력
//		첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//		출력
//		첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		
//		1)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		int N = Integer.parseInt(br.readLine()); // 첫번째 줄에 입력받은 숫자 정수형으로 형변환 후 대입   
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // StringTokenizer 객체 생성 후 초기화
		
		int min = Integer.MAX_VALUE; // min 초기값으로 Integer 최댓값 저장
		int max = Integer.MIN_VALUE; // max 초기값으로 Integer 최솟값 저장
		
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken()); // 토큰 a에 대입
			
			if(a < min) {
				min = a;
			}
			
			if(a > max) {
				max = a;
			}
			
		}
		
		System.out.println(min + " " + max);
		
		
	}

}
