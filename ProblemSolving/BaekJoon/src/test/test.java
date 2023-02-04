package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		// 선언
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

				// 인덱스 값 입력
				System.out.print("인덱스 설정 : ");
				int index = Integer.parseInt(bf.readLine());
				int nNum[] = new int[index];
				
				// 합 선언
				int sum=0;

				// 배열에 값 넣기
				for (int i = 0; i < nNum.length; i++) {
					nNum[i] = Integer.parseInt(bf.readLine());
					// 값 누적
					sum+= nNum[i];
				}

				// 배열 오름차순 정렬
				Arrays.sort(nNum);
				
				System.out.println(""); // 띄어쓰기
				System.out.println("합계 : "+sum);
				System.out.println("평균값 : "+sum/index);
				
				// 중앙값 구하기
				int middleNumber = nNum[index/2];
				// 인덱스가 홀수있때
				if (index% 2 == 1) {
					System.out.println("중앙값 : "+middleNumber);
				
				} else { // 인덱스가 짝수일때
					System.out.println("중앙값 : "+(middleNumber+(nNum[((index/2)+1)]))/2 );
				}
	}
}
