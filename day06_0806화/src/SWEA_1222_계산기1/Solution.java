package SWEA_1222_계산기1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//3+4+5+6+7 -> ((((3+4)+5)+6)+7)  -> 34+5+6+7+
//미완성
public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("1222_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		Stack<Character> stack = new Stack<>();
		
		for(int t=0; t<10; t++) {	//테케 개수만큼 반복
			int c = sc.nextInt();	//계산식 길이
			String str = sc.next();	//계산식
			
			for(int i=0; i<c; i++) {	//계산식 길이만큼 반복
				if(0<=str.charAt(i) || str.charAt(i)<=9) {	//해당 인덱스가 '숫자인 캐릭터'일 경우
					stack.push(str.charAt(i));
					
				}
			}
		}
		
	}
	
	//입력된 수식에 괄호를 씌우는 메서드
	
	
}