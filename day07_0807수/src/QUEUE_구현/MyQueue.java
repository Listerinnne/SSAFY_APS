package QUEUE_구현;

import java.util.ArrayList;
import java.util.List;

public class MyQueue<E> {
	private int front;
	private int rear;
	private List<E> queue ;
	private final int MAX_SIZE ;
	
	public MyQueue(){
		this.MAX_SIZE = 5;
		this.queue = new ArrayList<>(MAX_SIZE);
		this.front = -1;
		this.rear = -1;
	}
	public MyQueue(int size) {
		this.MAX_SIZE = size;
		this.queue = new ArrayList<>(MAX_SIZE);
		this.front = -1;
		this.rear = -1;
		
	}
	
	public void enQueue(E e) {
		if(isFull()) {
			System.out.println("깍 찼다죠");
			return;
		}
		queue.add(++rear, e);
		System.out.println("삽입 완");
		
	}
	public E deQueue() {
		if(isEmpty()) {
			throw new IllegalStateException("큐가 비었음");
			}
		E e = queue.get(++front);
		System.out.println("front : "+front);
		//front는 삭제된 값의 인덱스를 가리켜야 하는데 해당 인덱스 값을 삭제하지 않고 그냥 냅둬도 되나?
		System.out.println("삭제 완");
		return e;
	}
	public MyQueue<E> createQueue() {
		return new MyQueue<E>();
	}
	public boolean isEmpty() {
		if(queue.isEmpty()) return true;
		return false;
	}
	//배열이 꽉 차는 조건? 아니근데 생각해보니까 ,,꽉찰 수 없는 거아님??? 리스트인데??? 늘어나는데??? 제한을 걸어야 하나
	public boolean isFull() {
		if(rear == MAX_SIZE-1) return true;
		return false;
	}
	public E peek() {
		if(rear == -1) throw new IllegalStateException("큐가 비었음"); 
		return queue.get(front+1);
	}
	public int size() {
		return rear - front;
	}
	public int getRear() {
		return rear;
	}
	public int getFront() {
		return front;
	}
}