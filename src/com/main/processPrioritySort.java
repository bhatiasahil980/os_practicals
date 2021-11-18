package src.com.main;

import java.util.Comparator;

public class processPrioritySort implements Comparator<Process> {

	@Override
	public int compare(Process o1, Process o2) {
		if(o1.getPriority() < o2.getPriority()) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
