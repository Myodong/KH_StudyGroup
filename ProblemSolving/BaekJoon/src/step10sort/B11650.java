package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B11650 {

	// 멤버 변수 선언
	public static int[][] coordinate;
	public static int[][] temp;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 입력 받을 값 갯수 인덱스 길이 값 입력 받기
		int inputN = Integer.parseInt(br.readLine());

		// 2차원 배열 입력받은 인덱스 길이로 초기화
		coordinate = new int[inputN][2];

		// 2차원 배열에 입력받은 좌표 값 넣기
		for (int i = 0; i < inputN; i++) {
			String[] xyNum = br.readLine().split(" ");
			coordinate[i][0] = Integer.parseInt(xyNum[0]);
			coordinate[i][1] = Integer.parseInt(xyNum[1]);
		}

		// 병합 정렬
		// Top-Down 방식 구현
		mergeSort();

		// BufferedWriter에 출력 문 담기
		for (int i = 0; i < inputN; i++) {
			bw.write(coordinate[i][0] + " " + coordinate[i][1] + "\n");
		}
		// 출력 후 스트림 닫기
		bw.close();
	}

	private static void mergeSort() {

		temp = new int[coordinate.length][2];
		mergeSort(0, coordinate.length - 1);
	}

	// 오버로딩
	private static void mergeSort(int left, int right) {
		if (left == right) {
			return;
			
		}
		int mid = (left + right) / 2;
		
		mergeSort(left, mid);
		mergeSort(mid + 1, right);
		merge(left, mid, right);

	}

	// 병합 메서드
	private static void merge(int left, int mid, int right) {
		int mergeLeft = left; 
		int mergeRight = mid+1; 
		int idx = left; 
		
		while (mergeLeft<=mid  && mergeRight<=right) {
			
			if (coordinate[mergeLeft][0]<coordinate[mergeRight][0]) {
				temp[idx] = coordinate[mergeLeft];
				mergeLeft++;
				idx++;
				
			} else if (coordinate[mergeLeft][0]>coordinate[mergeRight][0]) {
				temp[idx] = coordinate[mergeRight];
				mergeRight++;
				idx++;
				
			} else { // 앞자리 값이 같을 경우
				// 뒷자리 비교
				if (coordinate[mergeLeft][1]<=coordinate[mergeRight][1]) {
					temp[idx] = coordinate[mergeLeft];
					mergeLeft++;
					idx++;

				}else {
					temp[idx] = coordinate[mergeRight];
					mergeRight++;
					idx++;
				}
			}
		}
		
		if (mergeLeft>mid) {
			while (mergeRight<=right) {
				temp[idx]=coordinate[mergeRight];
				idx++;
				mergeRight++;
			}
		}else {
			while (mergeLeft<=mid) {
				temp[idx]=coordinate[mergeLeft];
				idx++;
				mergeLeft++;
			}
		}
		for (int i = left; i <= right; i++) {
			coordinate[i]=temp[i];
		}
	}

}
