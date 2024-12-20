package baekjoon.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제
//		세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
//		일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//
//		예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//
//		세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
//
//		1) 입력
//		1-1) 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 
//		1-2) 둘째 줄에 세준이의 현재 성적이 주어진다. 
//		이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
//
//		2) 출력
//		첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		int N = Integer.parseInt(br.readLine()); // 과목의 개수
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // StringTokenizer 객체 생성 후 초기화
		int[] score = new int[N]; // 현재 성적 
		double sum = 0; // 성적의 합 
		int max = 0; // 최고점수
		
//		-------- 성적 대입 --------
		for(int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
//		-------- 최고점수 --------
		for(int k = 0; k < N; k++) {
			if(max < score[k]) {
				max = score[k];
			}
		}
		
//		-------- 평균값 --------
		for(int j = 0; j < N; j++) {
			sum += (double) score[j] / max * 100;
		}
		
		double avg = sum / N;
		
		System.out.println(avg);
		
		
		
		
	}

}
