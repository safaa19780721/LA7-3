package LA7.MichaelCoffey.DylanTarnacki;
/**
 * thiis is the interface that Node will implement
 * @author Dylan
 *
 * @param <E> is the generic object for requests
 */
public interface INode<E> {
	
	E getData();
	Node<E> getNext();
	void setNext(Node<E> next);
}
