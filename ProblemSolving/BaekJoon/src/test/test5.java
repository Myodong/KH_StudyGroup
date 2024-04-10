package test;

import java.util.Scanner;

public class test5 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색 : ");
		String searchName = sc.next();
		
		boolean result = false;
		String[] memberArr = {"1","2","3","4","5"};

		for(int i=0; i<memberArr.length;i++) {
			
			if(memberArr[i].equals(searchName)) {
				result = true;
				break;
			}
		}
		if(result) {
			System.out.print("존재합니다. ");
		}else {
			System.out.print("존재안합");
		}
		
	}

}
