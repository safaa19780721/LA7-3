package LA7.MichaelCoffey.DylanTarnacki;

public class Request<E> implements Comparable<E>{
	private String name,major,level,courseDept;
	private int courseNum;
	private double[][] GPAs;
	
	/**
	 * This is the constructor for the Requests
	 * @param studentName is the name of the student
	 * @param studentDept is the department the student is majoring in
	 * @param studentLevel is the year of the student
	 * @param courseDept is the department the student wants to take the class in
	 * @param courseNumber is the course number
	 * @param GPA_Array is the array of GPAs for each class they have taken
	 */
	public Request(String studentName, String studentDept, String studentLevel,
			String courseDept, int courseNumber, double[][] GPA_Array) {
		name = studentName;
		major = studentDept;
		level = studentLevel;
		this.courseDept = courseDept;
		courseNum = courseNumber;
		GPAs = GPA_Array;
	}
	
	/**
	 * this is the getter for the course department
	 * @return String courseDept is the course department
	 */
	public String getCourseDept() {
		return courseDept;
	}
	
	/**
	 * getter for the course number
	 * @return int courseNum is the course number
	 */
	public int getCourseNum() {
		return courseNum;
	}
	
	/**
	 * getter for the name
	 * @return String name is the student name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * setter for the student name
	 */
	public void setName() {
		this.name = name;
	}
	
	/**
	 * shows what year the student is in
	 * @param level is the year of the student
	 * @return is what year they are in
	 */
	public int yearsFromGraduation(String level) {
		switch(level) {
			case"Senior":
				return 0;
			case"Junior":
				return 1;
			case"Sophomore":
				return 2;
			case"Freshman":
				return 3;
			default:
				return 4;
		}
	}
	
	/**
	 * calculates the students GPA
	 * @param GPA_Array is the GPAs of the student
	 * @return double totalGPA is the students overall GPA
	 */
	private double GPA_Cal(double[][] GPA_Array) {
		double totalGPA = 0.0;
		double classGPA = 0.0;
		double credits = 0.0;
		for(int i = 0; i < GPA_Array.length; i++) {
			double product = GPA_Array[i][0] * GPA_Array[i][1];
			double classCredit = GPA_Array[i][1];
			credits += classCredit;
			classGPA += product;
		}
		totalGPA = classGPA / credits;
		return totalGPA;
	}

	/**
	 * compares the students to each other
	 */
	public int compareTo(E comp) {
		Request req = (Request)comp;
		if(this.major.equals(this.courseDept) && req.major.equals(req.courseDept)) {
			if(this.level.compareTo(req.level) == 0) {
				if(this.GPA_Cal(this.GPAs) > req.GPA_Cal(req.GPAs)) {
					return -1;
				}
				else {
					return 1;
				}
			}
			else if(this.level.compareTo(req.level) < 0) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
			return 1;
		}
	}
}
