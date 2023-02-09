package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class test {

	public static void main(String[] args) throws IOException {

		
		int arr[] = {2,5,1,3,0,4};
		 int temp = 0;
		 
			for(int i = 0; i < arr.length; i++) {       // 1.
				for(int j= 1 ; j < arr.length-i; j++) { // 2.
					if(arr[j-1] > arr[j]) {             // 3.
		                // swap(arr[j-1], arr[j])
						temp = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(arr));
		
		
		
/////////////////////////////////////////////////////////////////////////////////////		
	}
}