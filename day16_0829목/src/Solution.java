

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	static int[] arr = {3,2,1,9};
	static int len = arr.length;
	static ArrayList<int[]> list;	//배열의 참조변수 리스트
	
	
	public static void main(String[] args) {
		
		list = new ArrayList<>();
		perm(0);

	}
	
	//idx와 idx~N-1까지 이동하는 i를 swap에 넣는 메서드
	static void perm(int idx) {

		//기저조건
		if(idx == len) {	//idx가 배열의 범위를 벗어날 경우
			
			list.add(arr);
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		//재귀
		for(int i=idx; i<len; i++) {
			swap(idx, i);
			perm(idx+1);
			swap(idx, i);
		}
		
	}
	
	//a와 b를 인덱스로 하는 요소의 자리를 바꾸는 메서드
	static void swap(int a, int b) {
		
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
		
	}

}