package baekjoon.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_10813 {

	public static void main(String[] args) throws IOException {
		
//		문제
//		도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 
//		바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
//
//		도현이는 앞으로 M번 공을 바꾸려고 한다. 
//		도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
//		
//		공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
//
//		1) 입력
//		1-1) 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
//
//		1-2) 둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. 
//		각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
//
//		도현이는 입력으로 주어진 순서대로 공을 교환한다.
//
//		2) 출력
//		1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // StringTokenizer 객체 생성 후 초기화
		
		int N = Integer.parseInt(st.nextToken()); // 정수형으로 형변환 후 n에 대입
		int M = Integer.parseInt(st.nextToken()); // 정수형으로 형변환 후 n에 대입
		
		int[] basket = new int[N]; // 바구니 갯수 생성
		
		
//		-------- 1-1) 반복문 시작 --------
		for(int a = 0; a < N; a++) {
			basket[a] = a + 1;
		}
		
		
//		-------- 1-2) 반복문 시작 --------
		for(int b = 0; b < M; b++) {
			st = new StringTokenizer(br.readLine(), " "); // 새롭게 토큰화
			int change1 = Integer.parseInt(st.nextToken()) - 1 ; // 첫번째 공의 값(인덱스이므로 -1)
			int change2 = Integer.parseInt(st.nextToken()) - 1; // 두번째 공의 값(인덱스이므로 -1)
			int tmp = basket[change1]; // 임시값에 첫번째 공의값 대입 
			basket[change1] = basket[change2];  // 첫번째 공의값에 두번째 공의값 대입
			basket[change2] = tmp;  // 두번째 공의값에 저장해 놓은 첫번째 공의값 대입
		}
		
//		-------- 2) 반복문 시작 --------
		for(int c = 0; c < N; c++) {
			System.out.print(basket[c] + " ");
		}
		
	}

}
