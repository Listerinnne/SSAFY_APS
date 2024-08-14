package 트리_구현;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		
		MyLinkedList mll = new MyLinkedList();
//		List<Integer> list = new LinkedList<>();
//		list.set(3, 9);	링크드리스트 값 바꾸기
		
	}
	
	
	
	
}


class Node{
	String data;
	Node prev;	//참조변수. 주소가 대입되는 칸
	Node next;	//참조변수
	
}

class MyLinkedList{
	Node head;	//참조변수
	List<Node> tail = new ArrayList<>();	//참조변수
	int size;
	
	public MyLinkedList() {}
	public MyLinkedList(int adress) {
		head = new Node();	//head가 참조할 객체 생성
//		tail[adress] = new Node();	
		tail.add(adress, new Node());	//tail이 참조할 객체 생성
		head.next = tail.get(adress);	//
		tail.get(adress).prev = head;
	}
	//삽입
	void insert(Node me, Node parent) {	//생성할 노드와 상위 노드의 주소
		if(parent == null) {
			System.out.println("첫 노드 생성");
			MyLinkedList tmp = new MyLinkedList(1);
			
		}
	}
	
	
}



















//class MyTree<E> {
//	
//	private E node ;
//	private int left;
//	private int right;
//	
//	private List<E> list = new LinkedList<>();
//	
//	
//	/*1. 어느 노드에 연결할 것인가(nodeIdx)
//	 * 2. 왼쪽 오른쪽 중 어디에 연결할 것인가(dir)*/
//	void add(int nodeIdx, int dir, E e/*삽입할 요소*/) {	
//		if(nodeIdx == 0) {
//			System.out.println("인덱스 0에는 요소가 위치할 수 없음");
//			return;
//		}else if(list.get(nodeIdx) == null) {
//			System.out.println("빈 노드에는 연결할 수 없음");
//			return;
//		}
//		
//	}
//	
//	
//	
//}