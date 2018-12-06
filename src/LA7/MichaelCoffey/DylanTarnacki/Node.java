package LA7.MichaelCoffey.DylanTarnacki;

public class Node<E> implements INode<E> {

	E dataValue;
	Node<E> nextNode;
	
	Node(E dataValue){
		this.dataValue=dataValue;
	}
	
	Node(E dataValue, Node<E> nextNode){
		this.dataValue = dataValue;
		this.nextNode = nextNode;
	}

	@Override
	public E getData() {
		
		return dataValue;
	}

	@Override
	public Node<E> getNext() {
		
		return nextNode;
	}

	@Override
	public void setNext(Node<E> next) {
		nextNode = next;
		
	}
	
}
