package SWEA_1225_암호생성기;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	//포인터를 쓰면 더 빠르게 할 수 있을지도,, 졸리당
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("1225_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		for(int t=0; t<10; t++) {	//테케 개수만큼 반복
			
			
			System.out.printf("#%d ", sc.nextInt());
			List<Integer> queue = new ArrayList<>();
			for(int d=0; d<8; d++) {	//8개의 데이터를 입력받는다
				queue.add(sc.nextInt());
			}
			
			
			int tmp = 0;	//맨 앞 요소를 저장할 변수
			int dec = 1;	//한 사이클을 돌 동안 1부터 5까지 반복되는 변수
			
			for(;;) {	//tmp-1이 0이 될 때까지 무한반복
				
				tmp = 0;
				tmp = queue.get(0);	//queue의 0번째 요소를 tmp에 저장
				queue.remove(0);	//0번째 인덱스의 요소를 제거한다. 
				
				if(tmp-dec <= 0) {	//tmp - dec(1에서 5까지의 수)가 0보다 작거나 같을 때
					queue.add(0);	//리스트의 마지막에 0을 삽입 후 반복문을 벗어난다. 
					break;
					}
				
				queue.add(tmp-dec);
				
				dec++;
				if(dec > 5) dec = 1;	//dec가 5보다 커지면 1로 초기화한다.
				
			}
			
			for(int num : queue) 
				System.out.print(num + " ");
			System.out.println();
			
			
			
		}
		
	}
	
}