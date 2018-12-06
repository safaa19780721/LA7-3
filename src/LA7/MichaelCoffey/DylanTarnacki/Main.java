package LA7.MichaelCoffey.DylanTarnacki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		PriorityQueue<Request> requestQueue = new PriorityQueue<Request>();
		LinkedList<Course> courses = new LinkedList<Course>();
		BufferedReader fileIn = new BufferedReader(new FileReader("C:\\Users\\Michael\\git\\repository\\LA7\\course.txt"));
		BufferedReader fileIn1 = new BufferedReader(new FileReader("C:\\Users\\Michael\\git\\repository\\LA7\\request.txt"));
		IController control = new Controller(requestQueue, courses, fileIn, fileIn1);
		control.readCourseFile();
		control.readRequestFile();
		control.processRequests();
		control.printClassList();


	}

}
