package LA7.MichaelCoffey.DylanTarnacki;

public class PriorityQueue<E> {

	Node<E> front;
	Node<E> tail;
	
	/**
	 * this method will check to see if the queue is empty
	 * @return boolean true or false if it is empty or not
	 */
	public boolean isEmpty() {
		if(front == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * this method adds the requests in the correct order based on the requirements that are given
	 * @param data is the request being put in
	 */
	public void enqueue(E data) {
		Request req = (Request)data;
		Node<E> newNode = new Node<E>(data,null);
		
		if(front == null && tail == null) {
			front = tail = newNode;
		}
		else {
			Node<E> temp1 = front;
			Node<E> temp2 = front;
			boolean flagger = true;
			while(temp1 != null) {
				Request tempReq = (Request)temp1.dataValue;
				if(tempReq.compareTo(req) == 1) {
					if(temp1 == front){
						newNode.nextNode = temp1;
						front = newNode;
					}
					else {
						temp2.nextNode = newNode;
						newNode.nextNode = temp1;
					}
					flagger = false;
				}
				else {
					temp2 = temp1;
					temp1 = temp1.nextNode;
					}
				}
			if(flagger = true) {
				temp2.nextNode = newNode;
				tail = newNode;
			}
		}
	}
	
	/**
	 * this will first request enqueued and take it out and make the next request the front
	 * @return
	 */
	public E dequeue() {
		E temp = front.getData();
		front = front.getNext();
		return temp;
	}
	
	/**
	 * this method is for printing out the queues
	 */
	public void Qprint() {
		System.out.println("<<<<<<<<<<<< Beginning of Queue Contents >>>>>>>>>>>>>>>>>");
		Node<E> temp = front;
		if(front == null) {
			System.out.println("Queue is empty!");
		}
		else {
			while(front != null) {
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
		System.out.println("<<<<<<<<<<<< End of Queue Contents >>>>>>>>>>>>>>>>>");
	}
	
}
