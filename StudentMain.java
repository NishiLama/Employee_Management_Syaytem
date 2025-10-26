package studentmanagementminiproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) throws Exception {
		
			StudentImplementation sia = new StudentImplementation();
			Scanner sc = new Scanner(System.in);
			
			int choice = 0;
			
			while(true) {
				System.out.println("______________Student Management System______________"); 
				System.out.println("Enter 1 to Add Students:");
				System.out.println("Enter 2 to View Students:");
				System.out.println("Enter 3 to Search Students:");
				System.out.println("Enter 4 to Delete Students:");
				System.out.println("Enter 5 to Update Marks of Students:");
				System.out.println("Enter 6 to Exit:");
				System.out.println("Enter your choice:");
				
				try {
					choice = sc.nextInt();
					sc.nextLine();
					
					switch(choice) {
						case 1: sia.addStudent();
						break;
						
						case 2: sia.viewStudent();
						break;
						
						case 3: 
							System.out.println("To search student enter Roll_No:");
							String rno1= sc.next();
							sia.searchStudent(rno1);
						break;
							
						case 4:
							System.out.println("To delete Student enter Roll_No:");
							String rno2= sc.next();
							sia.deleteStudent(rno2);
						break;
						
						case 5: 
							System.out.println("To update marks enter Roll_No:");
							String rno3= sc.next();
							sia.updateMarks(rno3);
						break;
							
						case 6:
							System.out.println("Exited from the program sucessfully!!!");
							sc.close();
							return; // or System.exit(0);
							
						default:
							System.out.println("Invalid choice! Please enter 1-6.");

						break;
					}
					
				}catch(InputMismatchException ie) {
					System.out.println("Invalid Input! Enter a number");
				}catch(ArrayIndexOutOfBoundsException arre) {
					System.out.println("No more student can be added");
				}catch(Exception e) {
					System.out.println("Error:" + e.getMessage());
				}	
			}	
	}
}
