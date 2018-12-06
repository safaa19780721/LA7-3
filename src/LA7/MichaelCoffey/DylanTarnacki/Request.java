package LA7.MichaelCoffey.DylanTarnacki;

public class Request<E extends Comparable<E>>{
	private String name,major,level,courseDept;
	private int courseNum;
	private double[][] GPAs;
	
	public Request(String studentName, String studentDept, String studentLevel,
			String courseDept, int courseNumber, double[][] GPA_Array) {
		name = studentName;
		major = studentDept;
		level = studentLevel;
		this.courseDept = courseDept;
		courseNum = courseNumber;
		GPAs = GPA_Array;
	}
	public String getCourseDept() {
		return courseDept;
	}
	public int getCourseNum() {
		return courseNum;
	}
	public String getName() {
		return name;
	}
	
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

}
