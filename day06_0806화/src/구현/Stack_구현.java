package 구현;

import java.util.ArrayList;
import java.util.List;

public class Stack_구현 {
	
	public static void main(String[] args) {
		
		Stack_구현 st = new Stack_구현();
		st.push(12);
		st.push(13);
		st.push(14);
		st.push(15);
		st.push(44);
		System.out.println();
		
		st.pop();
		System.out.println(st.isEmpty());
		System.out.println();
		st.pop();
		st.pop();
		st.size();
		System.out.println();
		st.pop();
		st.pop();
		st.pop();
		st.size();
		System.out.println(st.isEmpty());
		
		
	}
	
	
	List<Integer> stack = new ArrayList<>();

	void push(int input) {
		stack.add(input);
		System.out.println("값 추가 완료");
	}
	int pop(){
		if(stack.size() == 0) {
			System.out.println("값이 없음");
			return -1;
		}
		int tmp = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		System.out.println("값 삭제 완료");
		return tmp;
	}
	boolean isEmpty() {
		if(stack.size() == 0) 
			return true;
		return false;
	}
	int peek(){
		if(stack.size() == 0) {
			System.out.println("값이 없음");
			return -1;
		}
		return stack.get(stack.size()-1); 
	}
	int size() {
		return stack.size();
	}

}
