package src.com.main;
import java.util.Comparator;

public class processArrivalSort  implements Comparator<Process>{

	@Override
	public int compare(Process o1, Process o2) {
		if(o1.getArrivalTime() < o2.getArrivalTime()) {
			return -1;
		}
		else {
			return 1;
		}
	}
}

