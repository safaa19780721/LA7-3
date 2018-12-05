package LA7.MichaelCoffey.DylanTarnacki;

public interface INode<E> {
	
	E getData();
	Node<E> getNext();
	void setNext(Node<E> next);
}
