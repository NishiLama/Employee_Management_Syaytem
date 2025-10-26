package studentmanagementminiproject;

public class StudentDetails {
	private String rollNo;
	private String name;
	private StudentMarks[] marks;// stores marks data in array
	
	// Constructor
	StudentDetails(String rollNo, String name, StudentMarks[] marks){
		this.rollNo = rollNo;
		this.name = name;
		this.marks=marks;
	}
	
	// Getter(Read data)
	public String getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public StudentMarks[] getMarks() {
		return marks;
	}
	
	// Display Student data
	public void displayStudentData() {
		System.out.println("__________________Student Details_________________");
		System.out.println("Roll Number: "+ rollNo);
		System.out.println("Name: "+name);
		System.out.println("Subject & Marks ");
		
		//use for loop for displaying student marks data
		for(StudentMarks m: marks) {
			m.displayMarks();
		}
		System.out.println("Percentage:");
		for(StudentMarks m: marks) {
			System.out.println(m.getPercentage());
			m.gardeAndResult();
		}
		
	}
	
}
