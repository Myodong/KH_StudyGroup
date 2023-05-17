package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Test {

	public static void main(String[] args) throws Exception {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 상근이가 가지고 있는 숫자 개수
		int inputN = Integer.parseInt(br.readLine());
		// 상근이가 가지고 있는 숫자
		int numN[] = new int[inputN];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 입력받은 N 숫자들 배열에 넣기
		for (int n = 0; n < numN.length; n++) {
			numN[n] = Integer.parseInt(st.nextToken());
		}

		// 숫자카드 M 개수
		int inputM = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");

		// 입력받은 M숫자들을 배열에 넣으면서 상근이가 가진 numN과 비교
		Arrays.sort(numN); // numN 배열 정렬

		for (int i = 0; i < inputM; i++) {
			int target = Integer.parseInt(st.nextToken());
			int lowerBound = lowerBound(numN, target);
			int upperBound = upperBound(numN, target);
			int frequency = upperBound - lowerBound; // 빈도수 계산
			bw.write(frequency + " ");
		}

		bw.close();
		br.close();
	}

	// 이분 탐색으로 target 값의 lower bound를 찾는 메서드
	private static int lowerBound(int[] arr, int target) {
		int start = 0;
		int end = arr.length;

		while (start < end) {
			int mid = (start + end) / 2;
			if (arr[mid] >= target)
				end = mid;
			else
				start = mid + 1;
		}

		return start;
	}
	// 이분 탐색으로 target 값의 upper bound를 찾는 메서드
	private static int upperBound(int[] arr, int target) {
		int start = 0;
		int end = arr.length;

		while (start < end) {
			int mid = (start + end) / 2;
			if (arr[mid] > target)
				end = mid;
			else
				start = mid + 1;
		}

		return start;
	}
}