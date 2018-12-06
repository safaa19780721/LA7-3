package LA7.MichaelCoffey.DylanTarnacki;
/**
 * this is the interface that Course will implement
 * @author Dylan
 *
 */
public interface ICourse {

	boolean isFull();
	void addStudent(String name);
	void printClassList();
	boolean equals(Object arg0);
}
