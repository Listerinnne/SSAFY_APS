package 순열_구현_실습;


import java.util.Arrays;

public class Solution {
	
	static int[] arr = {3,2,1,2,3};
	static int len = arr.length;
//	static int[] tmp = new int[len];
	
	public static void main(String[] args) {
		
//		for(int a=0; a<len; a++) {
//			for(int b=a; b<len; b++) {
//				if(arr[a] == arr[b]) {
//					tmp[b] = tmp[a]+1;
//				}
//			}
//		}
		perm(0);

	}
	
	//idx와 idx~N-1까지 이동하는 i를 swap에 넣는 메서드
	static void perm(int idx) {

		//기저조건
		if(idx == len) {	//idx가 배열의 범위를 벗어날 경우
			
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		//재귀
		for(int i=idx; i<len; i++) {
			
//			if(i == 0) {
//				for(int j=0; j<tmp.length; j++) {
//					if(tmp[idx] > 1){
//						return;
//					}
//				}
//			}
			
			swap(idx, i);	
			perm(idx+1); //비교 시작지점을 한칸 옮겨준다
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