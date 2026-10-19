package Students;

public class Result {

	int stId;
	String Stname;
	String Subname;
	int Marks;
	Grade Grade;
	int date = 9;

	Result(String Stname,String Subname,int Marks,Grade Grade,int date){
		this.Stname=Stname;
		this.Subname=Subname;
		this.Marks=Marks;
		this.Grade=Grade;
		this.date=date;
	}
	public String getStname() {
		return Stname;
	}
	public void setStname(String stname) {
		Stname = stname;
	}
	public String getSubname() {
		return Subname;
	}
	public void setSubname(String subname) {
		Subname = subname;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public Grade getGrade() {
		return Grade;
	}
	public void setGrade(Grade grade) {
		Grade = grade;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int stId() {
		return stId;
	}
	public void stId(int stId) {
		this.stId = stId;
	}
	void AddResult(String Stname,String Subname,int Marks) {
		System.out.println("Add  marks ");
	}
	void Display() {
		System.out.println(Stname);
		System.out.println(Subname + " " + Marks + " " + Grade.DISTINCTION);
		System.out.println(date);
		
	}
	
	
	
}



