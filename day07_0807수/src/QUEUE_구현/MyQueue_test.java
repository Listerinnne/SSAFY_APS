package QUEUE_구현;

public class MyQueue_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue<Integer> queue = new MyQueue<>();
		
		MyQueue<Integer> queue2 = queue.createQueue();

		System.out.println("size() : " + queue.size());
		queue.enQueue(1);
		System.out.println("size() : " + queue.size());
		queue.enQueue(2);
		System.out.println("size() : " + queue.size());
		queue.enQueue(3);
		System.out.println("size() : " + queue.size());
		queue.enQueue(4);
		System.out.println("size() : " + queue.size());
		queue.enQueue(5);
		System.out.println("size() : " + queue.size());
		queue.enQueue(6);
		System.out.println("size() : " + queue.size());
		
		System.out.println("-------------");
		
		try {
			
		System.out.println(queue2.peek());	//오류 던져짐
		
		}catch (IllegalStateException e){
			
			System.out.println(e.getMessage());
			
		}
		queue2.enQueue(6);
		System.out.println("peek() : " + queue2.peek());
		queue2.enQueue(7);
		System.out.println("peek() : " + queue2.peek());
		queue2.enQueue(8);
		queue2.enQueue(9);
		queue2.deQueue();
		System.out.println("peek() : " + queue2.peek());
		queue2.deQueue();
		System.out.println("peek() : " + queue2.peek());
		System.out.println("size() : " + queue2.size());
		System.out.println(queue2.getRear());
		System.out.println(queue2.getFront());
		
		System.out.println(queue2.isEmpty());
		System.out.println(queue2.isFull());
		

	}

}
