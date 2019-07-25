package seb.models.dto;

public class PersonAnswers {
    
	private int age;
	private boolean isStudent;
	private int income;
    
	
    public PersonAnswers(int age, boolean isStudent, int income) {
        this.age = age;
        this.isStudent = isStudent;
        this.income = income;
    }
    
    public int getAge() {
		return age;
	}
    
    public void setAge(int age) {
    	this.age = age;
	}
    
    public boolean getIsStudent() {
		return isStudent;
	}
    
    public void setIsStudent(boolean isStudent) {
    	this.isStudent = isStudent;
	}
    
    
    public int getIncome() {
		return income;
	}
    
    public void setIncome(int income) {
    	this.income = income;
	}
}
