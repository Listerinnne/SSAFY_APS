package SWEA_1966_숫자를_정렬하자;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {

		int[] arr = new int[] { 69, 10, 30, 2, 16, 8, 31, 22 };

		// 삽입 정렬
		// i : 정렬되지 않은 집합의 첫번째 원소
		for (int i = 1; i < arr.length; i++) {
			int data = arr[i];
			// 정렬된 집합의 뒤에서부터 비교하여 위치 찾아주기
			int j;
			for (j = i - 1; j >= 0 ; j--) {
				if(arr[j] > data)	
					arr[j + 1] = arr[j];	//data를 바로 업데이트하지 않고 그 앞의 값을 뒤로 밀기만 함 
			}
			arr[j + 1] = data;	//반복이 끝난 후 마지막으로 민 자리에 data를 업데이트
			System.out.println(Arrays.toString(arr));
		}

	}
}
