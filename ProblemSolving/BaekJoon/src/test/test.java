package test;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);

	      int number;
//	      System.out.print("입력할 숫자의 갯수 : ");
	      number = sc.nextInt();
	      
	      int[] numberCount = new int[number];
	      int size = numberCount.length;

	      for(int i = 0; i<size; i++) {
//	         System.out.print("입력 : ");
	         numberCount[i] = sc.nextInt();
	      }
	      
	      Arrays.sort(numberCount);
	      
	      for(int i = 0; i<numberCount.length; i++) {
	         System.out.println(numberCount[i]);
	      }

	}		

}
