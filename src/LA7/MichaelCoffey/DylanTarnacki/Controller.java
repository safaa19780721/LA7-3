package LA7.MichaelCoffey.DylanTarnacki;

import java.io.BufferedReader;
import java.io.IOException;

public class Controller implements IController {
	private int totalRequests = 0;
	private BufferedReader courseFile, requestFile;
	private PriorityQueue<Request> requestQueue;
	private LinkedList<Course> courses;
	private String courseLine, requestLine;
	private double[][] GPAs = new double[4][2];
	private String[] fields = new String[3];
	private String[] fields1 = new String[13];

	public Controller(PriorityQueue<Request> requestQueue, LinkedList<Course> courses,
			BufferedReader fileIn, BufferedReader fileIn1) {
		
		this.requestQueue = requestQueue;
		this.courses = courses;
		courseFile = fileIn;
		requestFile = fileIn1;
	}
	
	@Override
	public void readCourseFile() {
		try {
			while(courseFile.ready()) {	
				courseLine = courseFile.readLine();
				fields = courseLine.split(",");
				courses.add(new Course(fields[0], Integer.parseInt(fields[1]), Integer.parseInt(fields[2])));
			}
			courseFile.close();
		}
		catch(IOException e) {
			
		}

	}

	@Override
	public void readRequestFile() {
		try {
			while(requestFile.ready()) {
				int i  = 4;
				requestLine = requestFile.readLine();
				fields1 = requestLine.split(",");
				for(int r = 0; r < GPAs.length; r++) {
					for(int c = 0; c < GPAs[r].length; c++) {
						GPAs[r][c] = Double.parseDouble(fields1[i]);
						i++;
					}
				}
				addRequest(new Request<Object>(fields1[0], fields1[1], fields1[2], fields1[3], Integer.parseInt(fields1[4]), GPAs));
				totalRequests++;
				requestFile.close();
			}
		}
		catch(IOException e) {
			
		}
	}

	@Override
	public void addRequest(Request req) {
		requestQueue.enqueue(req);
	}

	@Override
	public void processRequests() {
		Course courseObj;
		Request requestObj;
		for(int i =0; i < totalRequests; i++) {
			requestObj = requestQueue.dequeue();
			courseObj = getCourse(requestObj.getCourseDept(), requestObj.getCourseNum());
			if(!courseObj.isFull()) {
				courseObj.addStudent(requestObj.getName());
				System.out.println(requestObj.getName() + " successfully registered for " + requestObj.getCourseDept() +" " + requestObj.getCourseNum());
			}
			else {
				System.out.println(requestObj.getName() + " cannot register for " + requestObj.getCourseDept() +" " + requestObj.getCourseNum());
			}
		}
	}

	@Override
	public Course getCourse(String courseDept, int courseNumber) {
		for(int i = 0; i < courses.size(); i++) {
			if(courseDept.compareTo(courses.get(i).getName()) == 0) {
				if(courseNumber == courses.get(i).getNumber()) {
					return courses.get(i);
				}
			}
		}
		return null;
	}

	@Override
	public void printClassList() {
		for(int i = 0; i < courses.size(); i++) {
			System.out.println("Class list for " + courses.get(i).getName() + " " + courses.get(i).getNumber());
			courses.get(i).printClassList();
		}
	}

}
