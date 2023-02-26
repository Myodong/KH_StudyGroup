package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1181 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int inputN = Integer.parseInt(br.readLine());
		
		String arr[] = new String[inputN];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= br.readLine();
		}
		
		
	}

}
