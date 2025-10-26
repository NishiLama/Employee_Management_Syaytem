package studentmanagementminiproject;

import java.util.Scanner;

public class StudentImplementation implements StudentInterface{
	
	StudentDetails []studentDetails = new StudentDetails[50];
	Scanner sc = new Scanner(System.in);
	private int stuCount=0; //keep track of students and later we can increment
	
	
	// override add student method from interface 
	public void addStudent() {
		
		System.out.println("Enter Roll Number:");
		String rollNo = sc.next();
		
		System.out.println("Enter Student Name:");
		String name = sc.next();
		
		System.out.println("Enter number of Subjects:");
		int subCount = sc.nextInt();
		
		// creating student marks object to store data
		StudentMarks []marks = new StudentMarks[subCount];
		for (int i=0;i<subCount;i++) {
			
			System.out.println("Subject Number:"+ (i+1));
			System.out.println("Enter Subject Name :");
			String subject=sc.next();
			
			System.out.println("Enter Subject ID :");
			String subID=sc.next();
			
			System.out.println("Enter Maximum Marks :");
			double maxMarks = sc.nextDouble();
			
			System.out.println("Enter MarksObtained :");
			double marksObtained = sc.nextDouble();
			
			// Stores the data in the new Instance also passing data to constructor
			marks[i] = new StudentMarks(subject,subID,maxMarks,marksObtained);		
		}
		
		// also update the student
		studentDetails[stuCount] = new StudentDetails(rollNo, name, marks);
		stuCount++;
		
		System.out.println("Student added successfully!!!");
	}

	//override view student method from interface -> Display data
	public void viewStudent() {
		if (stuCount == 0 ) {
			System.out.println("Student Not Found...");
		}
		for(int i=0; i<stuCount; i++) {
			studentDetails[i].displayStudentData();
		}
	}
	
	//override search student from interface
	public void searchStudent(String rollNo) {
		for(int i=0; i<stuCount; i++) {
			if(studentDetails[i].getRollNo().equals(rollNo)) {
				studentDetails[i].displayStudentData();
				return;
			}
		}
		System.out.println("Student Not Found!!!");
	}
	
	
	//override delete student from interface
	public void deleteStudent(String rollNo) {
		for(int i=0; i<stuCount; i++) { // counts from 0 to 1
			if(studentDetails[i].getRollNo().equals(rollNo)) {
				for (int j = i; j < stuCount - 1; j++) {// stuCount - 1 find the index
                    studentDetails[j] = studentDetails[j + 1]; // replace or overwrites the student at index i
                }
				stuCount--;
				System.out.println("Student deleted successfully!!!");
			}
		}
		System.out.println("Student Not Found!!!");
	}
	
	//override update marks student from interface

	public void updateMarks(String rollNo) {
		for (int i=0; i < stuCount; i++) {
			if(studentDetails[i].getRollNo().equals(rollNo)) {
				StudentMarks[] marks = studentDetails[i].getMarks();
				for(StudentMarks m : marks) {
					System.out.println("Current:"+m.getSubject()+" marks:"+ m.getMarksObtained());
					System.out.println("Updated Mark is:");
					double updateMarks= sc.nextDouble();
					m.setMarksObtained(updateMarks);
				}
				System.out.print("Student Marks updated Sucessfully!!!");
				return;
			}
		}
		System.out.println("Student Not Found!!!");
	}
}
