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

		int arr[] = { 2, 5, 1, 3, 0, 4 };

		int indexMin, temp;
		for (int i = 0; i < arr.length - 1; i++) { // 1.
			indexMin = i;
			for (int j = i + 1; j < arr.length; j++) { // 2.
				if (arr[j] < arr[indexMin]) { // 3.
					indexMin = j;
				}
			}
			// 4. swap(arr[indexMin], arr[i])
			temp = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));

/////////////////////////////////////////////////////////////////////////////////////		
	}
}