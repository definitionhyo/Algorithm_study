package baekjoon.array1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class number_10807 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제
//		총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

//		1) 입력
//		1-1) 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 
//		1-2) 둘째 줄에는 정수가 공백으로 구분되어져있다. 
//		1-3) 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 
//		1-4) 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.

//		2)출력
//		첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter 객체 생성
		StringTokenizer st; // StringTokenizer 객체 선언 
		int N; // 정수형 변수 N 생성
		boolean isValidN; // boolean형 변수 isVliadN 생성
		boolean isValidv; // boolean형 변수 isVliadv 생성
		int v; // 정수형 변수 v 생성
		int count = 0; // 정수형 변수 count 선언
		
//		-------- 1-1) 반복문 시작 -------- 
		do {
			N = Integer.parseInt(br.readLine()); 
			isValidN = N >= 1 && 100 >= N;
		} while (!isValidN);
//		-------- 1-1) 반복문 종료 -------- 
		
		int[] array = new int[N]; // 정수형 변수 생성
		
		st = new StringTokenizer(br.readLine(), " "); // 입력받은 두번째 줄을 파싱함
		
//		-------- 1) 반복문 시작 --------
		for(int i = 0; N > i; i++) {
			array[i] = Integer.parseInt(st.nextToken()); // 정수형 형변환 후 i번째 인덱스에 저장
		}
//		-------- 1) 반복문 종료 --------
		
//		-------- 1-3) 반복문 시작 -------- 
		do {
			v = Integer.parseInt(br.readLine()); 
			isValidv = v >= -100 && 100 >= v;
		} while (!isValidv);
//		-------- 1-3) 반복문 종료 -------- 

//		-------- 2) 반복문 시작 --------
		for(int j = 0; array.length > j; j++) {
			if (array[j] == v) {
				count++;
			}
		}
//		-------- 2) 반복문 종료 --------
		
		bw.write(String.valueOf(count)); // count 출력
		br.close();
		bw.flush();
		bw.close();
	}

}



