package jobportal;
public class Candidate {
	int id;
	String name;
	int yop;
	int gradper;
	Candidate(int id, String name, int yop, int gradPer){
		this.id=id;
		this.name=name;
		this.yop=yop;
		this.gradper=gradPer;
	}
	// To generate user defined hashcode id...
	public int hashCode() {
		return id;
	}
	// To check the user defined id is already present or not..
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	}
	
	public void candDetails() {
		System.out.println("Student Id     :"+id);
		System.out.println("Student Name   :"+name);
		System.out.println("Student YOP    :"+yop);
		System.out.println("Student Grad % :"+gradper);
	}
}
