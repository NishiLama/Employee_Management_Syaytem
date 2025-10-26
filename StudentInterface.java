package studentmanagementminiproject;

public interface StudentInterface {
	//abstract method
	void addStudent();
	void viewStudent();
	void searchStudent(String rollNo);
	void deleteStudent(String rollNo);
	void updateMarks(String rollNo);
}
