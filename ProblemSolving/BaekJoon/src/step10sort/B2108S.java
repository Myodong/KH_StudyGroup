package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B2108S {
	public static void main(String[] args) throws Exception {

		// 선언
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//inputN=9
		//values = 15 13 17 7 5 5 1 0 7
		
		// 입력받을 갯수
		int inputN = Integer.parseInt(bf.readLine());

		// 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.
		// -4000 ~ 4000 0포함하여 8001
		int arr[] = new int[8001];

		// 누적값
		double sum = 0;
		// 최댓값
		// -2147483648
		int max = Integer.MIN_VALUE;
		// 최솟값
		// 2147483647
		int min = Integer.MAX_VALUE;

		// -4000~4000 을 제외한 수로 초기화
		// 최빈값
		int mode = 5000;
		// 중앙 값
		int median = 5000;

		// 입력받은 inputN 값 만큼 for문 돌리기
		for (int i = 0; i < inputN; i++) {
			// 값 입력 받기
			int value = Integer.parseInt(bf.readLine());
			// 누적값 구하기
			sum += value;

			// 카운팅
			arr[value + 4000]++;
			/* arr[8001]
				[4000] = 1
				[4001] = 1
				[4005] = 2
				[4007] = 2
				[4013] = 1
				[4015] = 1
				[4017] = 1
			 */

			// 최소/최대 값 구하기
			if (max < value) {
				max = value;
			}
			if (min > value) {
				min = value;
			}
		}

		// 이전의 동일한 최빈값이 1번만 등장했을경우 true, 아닐경우 false
		boolean flag = false;
		// 중앙값 빈도 누적 수
		int count = 0;
		// 최빈값의 최댓값
		int modeMax = 0;

		for (int i = min + 4000; i <= max + 4000; i++) {

			if (arr[i] > 0) {
				// 중앙값 찾기
				// 누적횟수가 전체 전체 길이의 절반에 못 미친다면
				if (count < (inputN + 1) / 2) {
					// i값의 빈도수를 count 에 누적
					count += arr[i];
					median = i - 4000;
				}
				// 최빈값 찾기
				// 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우
				if (modeMax < arr[i]) {
					System.out.println("----------IF----------");
					modeMax = arr[i];
					mode = i - 4000;
					System.out.println("modeMax="+ modeMax);
					System.out.println("mode   ="+ mode);
					// 처음일때 true 로 변경
					flag = true;
					System.out.println("flag   ="+flag);
				}
				// 이전 최빈값 최댓값과 동일한 경우, 한 번만 중복되는 경우
				else if (modeMax == arr[i] && flag == true) {
					System.out.println("----------Else IF----------");
					mode = i - 4000;
					flag = false;
					System.out.println("mode   ="+ mode);
					System.out.println("flag   ="+ flag);
				}
			}
		}

		bw.write((int)Math.round(sum / inputN) + "\n"+median+"\n"+mode+"\n"+(max-min));
		bw.close();
	}
}
