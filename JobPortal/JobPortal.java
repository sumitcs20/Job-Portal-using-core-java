package jobportal;
import java.util.*;

public class JobPortal {
	public static void main(String[] args) {
		
		 //Object creation of classes and implementation classes...
		 TreeSet<Candidate> ts1 = new TreeSet(new DescPercentage());
		 HashSet<Company> hs2 = new HashSet();
		 Scanner sc = new Scanner(System.in);
		 
		 //***** Welcome Code...
		 System.out.println("######## WELCOME! to Job Portal ########");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println();
		 
		 //***** Registration of Candidates...
		 System.out.println("----------------------------------------");
		 System.out.println("    #  Candidate Registration");
		 System.out.println("----------------------------------------");
		 for (int i = 1; i <=5; i++) {
			 System.out.print("Student Id    : ");
			 int id=sc.nextInt();
			 System.out.print("Student Name  : ");
			 sc.nextLine();
			 String name=sc.nextLine();
			 System.out.print("Student YOP   : ");
			 int yop=sc.nextInt();
			 System.out.print("Student Grad% : ");
			 int gradper=sc.nextInt();
			 Candidate cnd =new Candidate(id, name, yop, gradper);
			 ts1.add(cnd);
			 System.out.println();
		 }
		 
		 
		 //***** Registration of Company...
		 System.out.println("----------------------------------------");
		 System.out.println("     # Company Registration ");
		 System.out.println("----------------------------------------");
		 System.out.print("Company Id              : ");
		 int compid=sc.nextInt();
		 System.out.print("Company Name            : ");
		 sc.nextLine();
		 String compname=sc.nextLine();
		 System.out.print("Eligible Candidate YOP  : ");
		 int eligyop=sc.nextInt();
		 System.out.print("Eligible Candidate Per% : ");
		 int eligper=sc.nextInt();
		 Company cmp =new Company(compid,compname,eligyop,eligper);
		 hs2.add(cmp);
		 System.out.println("\n \n \n");
		 
		 
		//***** Registered Company Details printing...
		 System.out.println("----------------------------------------");
		 System.out.println(" # Total Company Registered: "+hs2.size());
		 System.out.println("----------------------------------------");
		 for (Company cp : hs2) {
				System.out.println();
				cp.compDetails();
		 }System.out.println();

		 
		 //***** Registered Students Details printing...
		 System.out.println("----------------------------------------");
		 System.out.println(" # Total Candidates Registered: "+ts1.size());
		 System.out.println("----------------------------------------");
		 for (Candidate cd: ts1) {
			 System.out.println();
			 cd.candDetails();
		 }System.out.println();
		 
		 
		 System.out.println("----------------------------------------");
		 System.out.println("*** Eligible Candidate's List ***");
		 System.out.println("----------------------------------------");
		 for (Candidate cd : ts1) {
			 System.out.println();
			 if(cd.yop==cmp.eligyop && cd.gradper>=cmp.eligper) {
				 cd.candDetails();
			 }
		}
		 
		 
		 System.out.println("Thanks! for visiting the Job Portal..");
		 System.out.println("              ***");
	}
}
