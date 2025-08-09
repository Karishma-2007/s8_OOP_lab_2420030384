package Task4;

public class Students {

    private int rollNumber;
    protected char grade;
    public String name;
    
    public void setDetails(int rollNumber, char grade, String name) {
    	
    this.rollNumber = rollNumber;
    this.grade = grade;
    this.name = name;

    }
    
    public void showDetails() {
    	
    	System.out.println("RollNumber: "+rollNumber);
    	System.out.println("RollNumber: "+grade);
    	System.out.println("RollNumber: "+name);
    
    }
	
}


