package LA7.MichaelCoffey.DylanTarnacki;

public interface IController {

	void readCourseFile();
	void readRequestFile();
	void addRequest(Request req);
	void processRequests();
	Course getCourse(String courseDept, int courseNumber);
	void printClassList();
}
