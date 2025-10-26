package studentmanagementminiproject;

public class StudentMarks {
	private String subject;
    private String subID;
    private double maxMarks;
    private double marksObtained;
    
    // Constructor
    StudentMarks(String subject, String subID, double maxMarks,double marksObtained){
    	this.subject =subject;
    	this.subID = subID;
    	this.maxMarks= maxMarks;
    	this.marksObtained= marksObtained;
    }
    
    // Setters & Getters
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubID() {
		return subID;
	}

	public void setSubID(String subID) {
		this.subID = subID;
	}

	public double getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(double maxMarks) {
		this.maxMarks = maxMarks;
	}

	public double getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(double marksObtained) {
		this.marksObtained = marksObtained;
	}
	
	
	// Percentage of Marks
	public double getPercentage() {
        return (marksObtained / maxMarks) * 100;
    }

	
	// display Marks
	public void displayMarks() {
		System.out.println("Subject: "+subject+"-"+subID+" :Marks Obtained:"+marksObtained+" Out of "+ maxMarks);
	}
	
	// grade and result
	
	public void gardeAndResult(){
		if(getPercentage()>=90) {
			System.out.println("Grade: S \n Result: Pass");
		}
		else if(getPercentage()>=80 && getPercentage()<90) {
			System.out.println("Grade: A \n Result: Pass");
		}
		else if(getPercentage()>=70 && getPercentage()<80) {
			System.out.println("Grade: B \n Result: Pass");
		}
		else if(getPercentage()>=60 && getPercentage()<70) {
			System.out.println("Grade: C \n Result: Pass");
		}
		else if(getPercentage()>=50 && getPercentage()<60) {
			System.out.println("Grade: D \n Result: Pass");
		}
		else if(getPercentage()>=40 && getPercentage()<50) {
			System.out.println("Grade: E \n Result: Pass");
		}
		else {
			System.out.println("Grade: F \n Result: Fail");
		}
	}
	
	
}
