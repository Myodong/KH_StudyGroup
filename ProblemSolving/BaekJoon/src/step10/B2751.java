package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
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
		System.out.println("-----------------");
		// 배열 오름차순 
		Arrays.sort(nNum);
		
		// for문 으로 출력하기
		for (int x = 0; x < nNum.length; x++) {
			System.out.println(nNum[x]);
		}
	}

}
