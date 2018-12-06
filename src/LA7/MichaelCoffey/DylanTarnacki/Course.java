package LA7.MichaelCoffey.DylanTarnacki;

public class Course implements ICourse {

	private int courseCapacity, currentCount = 0, courseNumber;
	private LinkedList<String> classList;
	private String name;
	
	/**
	 * This is the constructor for the Course class
	 * @param courseName is the name of the course
	 * @param courseNumber is the course number
	 * @param courseCapacity is how many people can take the course
	 */
	public Course(String courseName, int courseNumber, int courseCapacity) {
		setName(courseName);
		setNumber(courseNumber);
		setCapacity(courseCapacity);
	}
	
	/**
	 * this will set the name of the student
	 * @param name is the students name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * this will get the name of the student
	 * @return name is the name of the student
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * this will set the course number
	 * @param number is the course number
	 */
	public void setNumber(int number) {
		courseNumber = number;
	}
	
	/**
	 * this will get the course number
	 * @return number is the course number
	 */
	public int getNumber() {
		return courseNumber;
	}
	
	/**
	 * this will set the capacity of the class
	 * @param capacity is the amount of students allowed to take the class
	 */
	public void setCapacity(int capacity) {
		courseCapacity = capacity;
	}
	
	/**
	 * this is a method that lets you know if the course desired is full or not and will return a boolean statement
	 */
	public boolean isFull() {
		if(currentCount < courseCapacity)
			return false;
		else
			return true;
	}

	/**
	 * this adds the student into the class list
	 */
	public void addStudent(String name) {
		 classList.add(name);
	}

	/**
	 * method for printing out the class list
	 */
	@Override
	public void printClassList() {
		for(int i = 0; i < classList.size(); i++) {
			System.out.println(classList.get(i));
		}

	}

}
