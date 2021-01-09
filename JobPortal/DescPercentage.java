package jobportal;
import java.util.Comparator;
public class DescPercentage implements Comparator<Candidate> {

	// to change the order of candidate by sorting their percentage in descending order(higher to Lower..)
	public int compare(Candidate o1, Candidate o2) {
		return -(o1.gradper-o2.gradper);
	}
}
