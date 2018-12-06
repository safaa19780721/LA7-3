package LA7.MichaelCoffey.DylanTarnacki;

public class LinkedList<E> {
	
	Node<E> tail;
	Node<E> head;
	
	/**
	 * this method checks to see if the linked list is empty
	 * @return
	 */
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * this will add a request E into the list
	 * @param item is the generic item being added into the list
	 */
	public void add(E item) {
		Node<E> newNode = new Node<E>(item,null);
		
		if(head == null){
			head = newNode;
		}
		else {
			Node<E> temporary = head;
			while(temporary.getNext() != null) {
				temporary = temporary.getNext();
			}
			temporary.setNext(newNode);
		}
	}
	
	/**
	 * this is the method to get the position data
	 * @param position is the position 
	 * @return temp.getData() is the data in the position
	 */
	public E get(int position) {
		int i = 0;
		Node<E> temp = head;
		while(position != i) {
			temp = temp.getNext();
			i++;
		}
		return temp.getData();
	}
	
	/**
	 * this method returns the size of the linked list
	 * @return size is the size of the linked list
	 */
	public int size() {
		int size = 0;
		
		Node<E> temp = head;
		while(temp != null) {
			temp = temp.getNext();
			size++;
		}
		return size;
	}

}
