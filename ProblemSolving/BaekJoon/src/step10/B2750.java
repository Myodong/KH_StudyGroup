package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2750 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * 문제 N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
		 * 
		 * 입력 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 
		 * 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
		 * 
		 * ex) 입력
		 * 5
		 * 10
		 * 15
		 * 1
		 * 6
		 * 2
		 * 
		 * 출력 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
		 * ex) 출력 
		 * 1
		 * 2
		 * 6
		 * 10
		 * 15
		 */
		
		
		// 선언
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력
		System.out.print("N개입력 : ");
		// 입력 받은 정수 값 으로  배열인덱스 설정
		int nNum[] = new int[Integer.parseInt(bf.readLine())];
		
		// for문 으로 인덱스 길이만큼 값 넣기
		for (int i = 0; i < nNum.length; i++) {
			nNum[i] = Integer.parseInt(bf.readLine());
		}
		// 줄 띄우기
		System.out.println("");
		// 배열 오름차순 
		Arrays.sort(nNum);
		
		// for문 으로 출력하기
		for (int x = 0; x < nNum.length; x++) {
			System.out.println(nNum[x]);
		}
	}

}
