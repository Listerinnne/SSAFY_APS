package 연결_스택_구현;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	LinkedStack ls = new LinkedStack();
	
	
	
}


class LinkedStack{
	
	private Node top;
	List<Integer> list;
	LinkedStack(){
		top = new Node();
		list = new ArrayList<>();
	}
	
	
	
	void push(Node num, int i){
		num = new Node();	//새 객체 생성
		num.head = 
		top.head++;
//		top.link
		System.out.printf("%d 삽입 완\n", num);
		head++;
	}
	
	void pop() {
		list.get(top.data);
		list.remove(top.head);
		top.head--;	
	}
	
}


class Node{
	
	Node(){}
	int data;
	Node link; //참조변수가 되는 건가??
	int head;
	int newHead;
	
}