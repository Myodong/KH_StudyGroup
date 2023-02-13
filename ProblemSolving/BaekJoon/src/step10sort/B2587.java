package step10sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2587 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 어떤 수들이 있을 때, 그 수들을 대표하는 값으로 가장 흔하게 쓰이는 것은 평균이다. 평균은 주어진 모든 수의 합을 수의 개수로 나눈
		 * 것이다. 예를 들어 10, 40, 30, 60, 30의 평균은 (10 + 40 + 30 + 60 + 30) / 5 = 170 / 5 =
		 * 34가 된다.
		 * 
		 * 평균 이외의 또 다른 대표값으로 중앙값이라는 것이 있다. 중앙값은 주어진 수를 크기 순서대로 늘어 놓았을 때 가장 중앙에 놓인 값이다.
		 * 예를 들어 10, 40, 30, 60, 30의 경우, 크기 순서대로 늘어 놓으면
		 * 
		 * 10 30 30 40 60
		 * 
		 * 이 되고 따라서 중앙값은 30이 된다.
		 * 
		 * 다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오.
		 * 
		 * 입력
		 * 첫째 줄부터 다섯 번째 줄까지 한 줄에 하나씩 자연수가 주어진다. 주어지는 자연수는 100 보다 작은 10의 배수이다.
		 * ex)
		 * 10
		 * 40
		 * 30
		 * 60
		 * 30
		 * 
		 * 출력
		 * 첫째 줄에는 평균을 출력하고, 둘째 줄에는 중앙값을 출력한다. 평균과 중앙값은 모두 자연수이다.
		 * ex)
		 * 34
		 * 30
		 */
		
		
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
		
		
		
		
		
		/* 제출용 코드 
		 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int nNum[] = new int[5];
		
		int sum=0;

		for (int i = 0; i < nNum.length; i++) {
			nNum[i] = Integer.parseInt(bf.readLine());
			sum+= nNum[i];
		}

		Arrays.sort(nNum);
		
		System.out.println(sum/5);
		System.out.println(nNum[5/2]);
		
		*/
	}
}
