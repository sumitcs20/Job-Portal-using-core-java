package jobportal;

public class Company {
	int compid;
	String compname;
	int eligyop;
	int eligper;
	Company(int compid, String compname, int eligyop, int eligper){
		this.compid=compid;
		this.compname=compname;
		this.eligyop=eligyop;
		this.eligper=eligper;
	}
	// To generate user defined hashcode id...
	public int hashCode() {
		return compid;
	}
	// To check the user defined id is already present or not..
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	}
	
	
	public void compDetails() {
		System.out.println("Company Id        : "+compid);
		System.out.println("Company Name      : "+compname);
		System.out.println("Eligibility YOP   : "+eligyop);
		System.out.println("Eligible Grad %   : "+eligper);
	}
}
