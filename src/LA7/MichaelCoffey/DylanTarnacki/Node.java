package LA7.MichaelCoffey.DylanTarnacki;

public class Node<E> implements INode<E> {

	E dataValue;
	Node<E> nextNode;
	
	/**
	 * This is the constructor for the Node class
	 * @param dataValue is the data
	 */
	Node(E dataValue){
		this.dataValue=dataValue;
	}
	
	/**
	 * This is another constructor for a different instance of node
	 * @param dataValue is the data
	 * @param nextNode is if there is another node after this first
	 */
	Node(E dataValue, Node<E> nextNode){
		this.dataValue = dataValue;
		this.nextNode = nextNode;
	}

	/**
	 * this is the method that will get the data value 
	 * @return dataValue is the data value
	 */
	@Override
	public E getData() {
		
		return dataValue;
	}

	/**
	 * this is the getter for the next node
	 * @return nextNode is the next node
	 */
	@Override
	public Node<E> getNext() {
		
		return nextNode;
	}

	/**
	 * this method will set the next node as next
	 */
	@Override
	public void setNext(Node<E> next) {
		nextNode = next;
		
	}
	
}
