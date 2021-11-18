package src.com.main;

import java.util.Comparator;

public class processBurstSort implements Comparator<Process> {

	@Override
	public int compare(Process o1, Process o2) {
		if(o1.getBurstTime() < o2.getBurstTime()) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
