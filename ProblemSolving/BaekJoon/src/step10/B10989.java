package step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int input=Integer.parseInt(bf.readLine());
		int arr[] = new int[input];
		int result[] = new int[input];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}

		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int[] counting = new int[max+1];
		
		
		for (int i = 0; i < arr.length; i++) {
			counting[arr[i]]++;
		}
		
		for (int i = 1; i < counting.length; i++) {
			counting[i]+= counting[i-1];
		}
		
		for (int i = arr.length-1; i >= 0; i--) {
			counting[arr[i]]--;
			result[counting[arr[i]]]=arr[i];
			
		}
		
		for (int x = 0; x < arr.length; x++) {
			bw.write(String.valueOf(result[x]) + "\n");
		}
		bw.flush();
		bw.close();
	}

}
