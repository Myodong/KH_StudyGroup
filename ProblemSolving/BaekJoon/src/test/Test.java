package test;

import java.util.Arrays;
import java.util.Iterator;

public class Test {

	public static void main (String[] arge) {
		
		int arr[] = { 2, 5, 1, 3, 0, 4 };
		int temp = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				
				if (arr[j-1] > arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
}