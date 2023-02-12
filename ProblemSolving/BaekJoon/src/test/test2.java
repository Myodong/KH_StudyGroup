package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1. 첫번째 입력값(앞으로 나올 수의 길이)를 정수형으로 바꾸는 작업
		int number = Integer.parseInt(br.readLine());

		System.out.println("----입력값-----");

		// 2. int형 배열을 만든 후, 각각의 입력값(String)을 int 배열에 넣어준다.
		int[] arr = new int[number];
		for (int i = 0; i < number; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// 정렬하기
		merge_sort(arr);

		System.out.println("-----정렬값----");
		// 출력
		for (int i = 0; i < number; i++) {
			System.out.println(arr[i]);
		}

	}

	private static int[] sorted; // 합치는 과정에서 정렬하여 원소를 담을 임시배열

	public static void merge_sort(int[] a) {

		sorted = new int[a.length]; // 배열 길이 
		merge_sort(a, 0, a.length - 1); // 배열, 0인덱스 시작, 마지막인덱스 시작
		sorted = null;
	}

	// Top-Down 방식 구현
	private static void merge_sort(int[] a, int left, int right) {
		System.out.println("쪼개집니당...");
		/*
		 * left==right 즉, 부분리스트가 1개의 원소만 갖고있는경우 더이상 쪼갤 수 없으므로 return한다.
		 */
		if (left == right) {
			System.out.println("리턴");
			System.out.println();
			return;
		}

		int mid = (left + right) / 2; // 절반 위치
		System.out.println("절반위치" + mid);

		// 재귀
		merge_sort(a, left, mid); // 절반 중 왼쪽 부분리스트(left ~ mid)'
			System.out.println("리턴하고 실행");
			System.out.println("left는 " + left );
			System.out.println("mid는 " + mid );
			System.out.println("right는 " + right );
			System.out.println();
		merge_sort(a, mid + 1, right); // 절반 중 오른쪽 부분리스트(mid+1 ~ right)
		
		merge(a, left, mid, right); // 병합작업

	}

	/**
	 * 합칠 부분리스트는 a배열의 left ~ right 까지이다.
	 * 
	 * @param a     정렬할 배열
	 * @param left  배열의 시작점
	 * @param mid   배열의 중간점
	 * @param right 배열의 끝 점
	 */
	private static void merge(int[] a, int left, int mid, int right) {
		System.out.println("병합...");
		int l = left; // 왼쪽 부분리스트 시작점
		int r = mid + 1; // 오른쪽 부분리스트의 시작점
		int idx = left; // 채워넣을 배열의 인덱스

		while (l <= mid && r <= right) {
			System.out.println("---");
			System.out.println("병합mid==" +mid);
			System.out.println("병합right==" +right);
			System.out.println("병합l=left==" +left);
			System.out.println("병합r=mid+1==" +(mid+ 1));
			System.out.println("병합idx==" +left);
			System.out.println("---");

			
			/*
			 * 왼쪽 부분리스트 l번째 원소가 오른쪽 부분리스트 r번째 원소보다 작거나 같을 경우 왼쪽의 l번째 원소를 새 배열에 넣고 l과 idx를 1
			 * 증가시킨다.
			 */
			if (a[l] <= a[r]) {
				System.out.println("");
				System.out.println("if");
				System.out.println("a[l]= "+a[l]);
				System.out.println("a[r]= "+a[r]);
				System.out.println("l= "+l);
				System.out.println("r= "+r);
				System.out.println("idx= "+idx);
				sorted[idx] = a[l];
				System.out.println("sorted[idx]= "+sorted[idx]);
				idx++;
				l++;
				System.out.println("idx++= "+ idx);
				System.out.println("l++= "+ l);
			}
			/*
			 * 오른쪽 부분리스트 r번째 원소가 왼쪽 부분리스트 l번째 원소보다 작거나 같을 경우 오른쪽의 r번째 원소를 새 배열에 넣고 r과 idx를 1
			 * 증가시킨다.
			 */
			else {
				System.out.println("");
				System.out.println("else");
				sorted[idx] = a[r];
				System.out.println("idx= "+ idx);
				System.out.println("sorted[idx]= "+sorted[idx]);
				idx++;
				r++;
				System.out.println("idx++= "+ idx);
				System.out.println("r++= "+ r);
			}
		}

		/*
		 * 왼쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우 (l > mid) = 오른쪽 부분리스트 원소가 아직 남아있을 경우 오른쪽 부분리스트의
		 * 나머지 원소들을 새 배열에 채워준다.
		 */
		if (l > mid) {
			System.out.println("");
			System.out.println("ifif");
			while (r <= right) {
				System.out.println("while---if");
				
				sorted[idx] = a[r];
				System.out.println("idx= "+ idx);
				System.out.println("sorted[idx]"+sorted[idx]);
				idx++;
				r++;
				System.out.println("idx++= "+ idx);
				System.out.println("r++= "+ r);
			}
		}

		/*
		 * 오른쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우 (r > right) = 왼쪽 부분리스트 원소가 아직 남아있을 경우 왼쪽
		 * 부분리스트의 나머지 원소들을 새 배열에 채워준다.
		 */
		else {
			System.out.println("");
			System.out.println("elseelse");

			while (l <= mid) {
				System.out.println("while---else");

				sorted[idx] = a[l];
				System.out.println("idx= "+ idx);
				System.out.println("sorted[idx]"+sorted[idx]);
				idx++;
				l++;
				System.out.println("idx++= "+ idx);
				System.out.println("l++= "+ l);
			}
		}

		/*
		 * 정렬된 새 배열을 기존의 배열에 복사하여 옮겨준다.
		 */
		for (int i = left; i <= right; i++) {
			a[i] = sorted[i];
			System.out.println("******************병합 : a["+i+"]="+a[i]);
		}
		System.out.println("");
		System.out.println("병합끝...");
	}
}