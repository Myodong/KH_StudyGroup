package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10814F {

	// 멤버 변수 선언
	public static String member[][];
	public static String temp [][];

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 입력 받을 원소 갯수 인덱스 길이 N 입력 받기
		int inputN = Integer.parseInt(br.readLine());

		// 2차원 배열 입력받은 인덱스 길이로 초기화
		member = new String[inputN][2];

		// 2차원 배열에 원소 입력 받기
		for (int i = 0; i < inputN; i++) {
			String[] xyNum = br.readLine().split(" ");
			member[i][0] = xyNum[0];
			member[i][1] = xyNum[1];
		}

		temp = new String[member.length][2];
		// 병합정렬 Top-Down
		mergeSort(0, member.length - 1);

		// BufferedWriter에 출력 문 담기
		for (int i = 0; i < inputN; i++) {
			bw.write(member[i][0] + " " + member[i][1] + "\n");
		}
		// 출력 후 스트림 닫기
		bw.close();

	}

	private static void mergeSort(int left, int right) {
		// 원소가 1개 일시 실행 안함
		if (left == right) {
			return;
		}

		// 가운대 위치
		int mid = (left + right) / 2;

		// 절반 중 왼쪽 부분리스트(left ~ mid)
		mergeSort(left, mid);
		// 절반 중 오른쪽 부분리스트(mid+1 ~ right)
		mergeSort(mid + 1, right);
		// 병합작업
		merge(left, mid, right);

	}

	/*##############
	실패한 부분
	 ##############*/
	private static void merge(int left, int mid, int right) {
		int mergeLeft = left; 
		int mergeRight = mid+1; 
		int idx = left; 
		
		while (mergeLeft<=mid  && mergeRight<=right) {
			
			if (Integer.parseInt(member[mergeLeft][0])<=Integer.parseInt(member[mergeRight][0])) {
				temp[idx][0] = member[mergeLeft][0];
				temp[idx][1] = member[mergeLeft][1];
				mergeLeft++;
				idx++;
				
			} else  {
				temp[idx][0] = member[mergeRight][0];
				temp[idx][1] = member[mergeRight][1];
				mergeRight++;
				idx++;
			}
		}
		
		if (mergeLeft>mid) {
			while (mergeRight<=right) {
				temp[idx][0] = member[mergeRight][0];
				temp[idx][1] = member[mergeRight][1];
				idx++;
				mergeRight++;
			}
		}else {
			while (mergeLeft<=mid) {
				temp[idx][0] = member[mergeLeft][0];
				temp[idx][1] = member[mergeLeft][1];
				idx++;
				mergeLeft++;
			}
		}
		/*
		 문제 코드!!
		 이유 위 코드에서 
			temp[idx][0] = member[mergeLeft][0];
			temp[idx][1] = member[mergeLeft][1];
			이런식으로 원소르 넣었기 때문에 
			주소값을 기준으로 정렬할거면 일관성 있게 주소값으로 정렬하고
			원소값을 기준으로 정렬할거면 일관성 있게 원소값으로 정렬해야하지만
			
			위에서는 원소 정렬 쓰다 주소값을 사용해서 이상하게 됨
				member[i]=temp[i];
			
		 * */
		for (int i = left; i <= right; i++) {
			member[i]=temp[i];
			
			/* 아래와 같이 써야 실행됨
			member[i][0]=temp[i][0];
			member[i][1]=temp[i][1];
			*/
		}
	}

}
