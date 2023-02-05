package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		// 선언
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("N전체인원, K상받을인원");
				String input[] = bf.readLine().split(" ");
				
				int memberAll = Integer.parseInt(input[0]);
				int memberAward = Integer.parseInt(input[1]);

				// 제한 조건
				if (1 <= memberAll && memberAll <= 1000 && 1<=memberAward && memberAward <= memberAll) {
					
					// 전체인원 수 만큼 인덱스 길이 설정
					String scoreIdx[] = new String[memberAll] ;

					int check=1;
					
					do {
						
						System.out.println("X점수를 입력하세요");
						scoreIdx = bf.readLine().split(" ");
						
						// 전체인원수 와 점수 수량이 맞는지 확인
						if (scoreIdx.length == memberAll) {
							
							// string 를 int 변환
							int[] newArr = Stream.of(scoreIdx).mapToInt(Integer::parseInt).toArray();
							
							// 값 하나하나 조건 확인
							for (int i = 0; i < newArr.length; i++) {
								
								if (0<=newArr[i] && newArr[i]<=10000) {
									
									check=0;
									
								}else {
									System.out.println("[!] 점수값이 잘못되었습니다.");
									check=1;
									break;
								}
							}
							
						}else {
							System.out.println("[!] 인원수에 맞게 점수를 입력해주세요");
							check=1;
						}
						
					} while (check==1);
					
			        
			        
			        
			        
					
				} else {
					System.out.println("[!] 입력범위가 잘못됬습니다.");
				}
	}		

}
