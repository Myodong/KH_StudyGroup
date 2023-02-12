package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		

		int nNum[] = new int[Integer.parseInt(bf.readLine())];
		
		for (int i = 0; i < nNum.length; i++) {
			nNum[i] = Integer.parseInt(bf.readLine());
		}

		Arrays.sort(nNum);
		

		for (int x = 0; x < nNum.length; x++) {
			System.out.println(nNum[x]);
		}
	}
	
	public static int[] temp; 
	
	public static void  mergeSort(int[] arr) {
		
		temp = new int[arr.length];
		mergeSort(arr,0,arr.length-1);
		temp = null;
	}
	

	private static void mergeSort(int[] arr, int left, int right) {
		
		if (left==right) {
			return;
		}
		
		int mid = (left+right)/2; 
		
		mergeSort(arr,left,mid); 
		mergeSort(arr,mid+1,right); 
		merge(arr, left, mid, right); 
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		
		int mergeRight = mid+1; 
		int mergeLeft = left; 
		int idx = left; 
		
		while (mergeLeft<=mid  && mergeRight<=right) {
			
			if (arr[mergeLeft]<=arr[right]) {
				temp[idx] = arr[mergeLeft];
				mergeLeft++;
				idx++;
				
			} else {
				temp[idx] = arr[mergeRight];
				mergeRight++;
				idx++;
			}
		}
		
		if (mergeLeft>mid) {
			while (mergeRight<=right) {
				temp[idx]=arr[mergeRight];
				idx++;
				mergeRight++;
			}
		}else {
			while (mergeRight<=mid) {
				temp[idx]=arr[mergeLeft];
				idx++;
				mergeLeft++;
			}
		}
		for (int i = left; i <= right; i++) {
			arr[i]=temp[i];
		}
	}
	

}
