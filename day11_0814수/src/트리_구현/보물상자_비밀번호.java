package 트리_구현;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 보물상자_비밀번호 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("5658_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	//테케 개수
		
		for(int tc=0; tc<t; tc++) {	//테케만큼 반복
			n = sc.nextInt();	//n개의 수가 주어짐
			int n4 = n/4;
			int k = sc.nextInt();	//k번쨰로 큰 수
			nStr = sc.next();	//입력받은 숫자를 String으로 저장
			List<Integer> list = new ArrayList<>();
			//---------------------------
			
			/*1. 문자열을 n/4개씩 나눠 반환한다
			 * 2. 16진수로 바꾸어 max와 비교, 더 큰 값을 max에 저장한다. 
			 * 3. 문자열을 돌린다.
			 * 4. 1부터 총 (n/4)번반복*/ 
			
			for(int a=0; a<n4; a++) {
				
				//문자열을 n/4개씩 나눠서 출력
				String tmp = "";
				for(int i=0; i<n; i=i+n4) {
					tmp = nStr.substring(i, i+n4);
					
					//10진수로 전환
					int tmpToNum = Integer.parseInt(tmp, 16);
					//중복 요소 제거
					if(!list.contains(tmpToNum))
						list.add(tmpToNum);
				}
				
				//문자열 돌리기
				nStr = rotate(nStr);
				
			}
			
			//내림차순 정렬,
			Collections.sort(list, Collections.reverseOrder());
			
			System.out.printf("#%d %d\n", tc+1, list.get(k-1));
			
		}
		
		
	}
	static int n;
	static String nStr;
	static String[] key;
	
	//문자열을 한 칸 돌리는 메서드
	static String rotate(String nStr) {	
		String tmp = ""+nStr.charAt(0);
		String result = nStr.substring(1) + tmp;
		return result;
	}
	

}
