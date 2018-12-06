package LA7.MichaelCoffey.DylanTarnacki;

public class LinkedList<E> {
	
	Node<E> tail;
	Node<E> head;
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
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
	
	public E get(int position) {
		int i = 0;
		Node<E> temp = head;
		while(temp != null) {
			temp = temp.getNext();
			i++;
		}
		return temp.getData();
	}
	
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
