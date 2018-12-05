package LA7.MichaelCoffey.DylanTarnacki;

public class Course implements ICourse {

	private int courseCapacity, currentCount, courseNumber;
	private String[] classList;
	private String name;
	
	public Course(String courseName, int courseNumber, int courseCapacity) {
		setName(courseName);
		setNumber(courseNumber);
		setCapacity(courseCapacity);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setNumber(int number) {
		courseNumber = number;
	}
	public int getNumber() {
		return courseNumber;
	}
	public void setCapacity(int capacity) {
		courseCapacity = capacity;
	}
	
	public boolean isFull() {
		if(currentCount < courseCapacity)
			return false;
		else
			return true;
	}

	public void addStudent(String name) {
		classList[currentCount] = name;
		currentCount++;
	}

	@Override
	public void printClassList() {
		for(int i = 0; i < classList.length; i++) {
			System.out.println(classList[i]);
		}

	}

}
