package 분할정복;

import java.util.Arrays;

public class 병합정렬_Solution {
	
	static int[] arr= {7,3,7,9,43,2,5,7,0,9,4,21,14,55,23};	//원본 배열
	static int n;		//원본배열의 길이
	static int[] tmp;	//임시 배열
	
	public static void main(String[] args) {
		
		n = arr.length;
		tmp = new int[n];
		
		mergeSort(0,n-1);
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void mergeSort(int left, int right) {
		//left = 나눈 배열의 시작 위치
		//right = 나눈 배열의 끝 위치
		

		if(left < right) {	//배열 길이가 1일 경우 left와 right가 동일하므로(?) =는 붙이지 않음
			
			int mid = (left + right) / 2 ;	//배열을 반으로 나눴을 때 왼쪽 끝부분의 인덱스
			//배열을 반으로 나눠 그 왼쪽, 오른쪽에 대해 재귀호출
			mergeSort(left, mid);		
			mergeSort(mid+1, right);
			
			merge(left, mid, right);
			
		}
		
	}

	private static void merge(int left, int mid, int right) {

		int idx = left;		//임시배열 tmp의 인덱스
		int L = left;		//나눠진 배열 왼쪽 구간의 시작 위치
		int R = mid + 1;	//나눠진 배열 오른쪽 구간의 시작 위치
		
		
			/* 1. L과 R이 각각의 끝 인덱스보다 작거나 같을 떄 arr[L]과 arr[R]을 비교
			 * 2. arr[R]이 더 클 경우 tmp[L]에 해당 요소 대입 & L++, idx++
			 * 3. arr[L]이 더 클 경우 tmp[R]에 해당 요소 대입 & R++, idx++
			 * (idx가 left에서 시작하기 때문에 작은 요소 먼저 대입)
			 * 4. 대입 후 남아있는 tmp[R] 혹은 tmp[L] 공간에 반대편의 요소를 원본배열에서 가져다 채우고 idx++
			 * 5. tmp배열에서 과정1부터 업데이트된 부분들을 원본배열에 업데이트한다. */
		
		//1
		while(L <= mid && R <= right) {
			
			//2
			//작은 요소를 임시배열에 먼저 대입
			if(arr[L] <= arr[R])
				tmp[idx++] = arr[L++];
			//3
			else
				tmp[idx++] = arr[R++];
			
		}//L과 R 중 하나가 나눠진 배열의 인덱스를 초과할 때까지 반복

		
		//4
		/*L과 R 중 하나는 반드시 나눠진 배열의 인덱스를 초과하지 못한 채 끝날 것이므로 
		 * 초과하지 못한 요소(들)의 자리를 찾아주어야 함*/
		if(L <= mid) {

			for(int i=L; i<mid+1; i++) {
				tmp[idx++] = arr[i];	//반복문이기 때문에 더해줄 필요 없음 
			}
		}else {
			
			for(int i=R; i<right+1; i++) {
				tmp[idx++] = arr[i]; 
			}
		}
		
		//5
		for(int i=left; i<right+1; i++) {
			arr[i] = tmp[i];
		}
		
		
	}

}












