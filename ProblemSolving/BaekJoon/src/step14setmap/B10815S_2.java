package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class B10815S_2 {

	public static void main(String[] args) throws Exception {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// 카드 개수 N 입력
		int inputN = Integer.parseInt(br.readLine());
		int[] cards = new int[inputN];

		st = new StringTokenizer(br.readLine(), " ");

		// 상근이 보유 카드 숫자 입력받기
		for (int i = 0; i < inputN; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}

		// 정렬하기
		Arrays.sort(cards);
		
		// 카드 개수 M 입력 받기
		int inputM = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < inputM; i++) {
			int temp = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(cards, inputN, temp) + " ");
		}
		
        bw.write(sb.toString() + "\n");
        bw.close();
        br.close();
	}

	//이분탐색(이진탐색)
	public static int binarySearch(int[] cards, int N, int search) {
		int first = 0;
		int last = N - 1;
		int mid = 0;

		while (first <= last) {
			mid = (first + last) / 2; // 중간 인덱스

			if (cards[mid] == search) { // 중간값과 찾으려는 수가 같은 경우
				return 1;
			}

			if (cards[mid] < search) { // 중간값이 찾으려는 수보다 작으면, 그 이하로는 볼 필요 없음.
				first = mid + 1;
			} else { // 중간값이 찾으려는 수보다 크면, 그 이상으로는 볼 필요 없음.
				last = mid - 1;
			}
		}
		return 0;
	}
}
