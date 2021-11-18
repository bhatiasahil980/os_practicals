package src.com.main;

public class Process {
	int Pid;
	int arrivalTime;
	int burstTime;
	int waitingTime;
	int turnAroundTime;
	int completionTime;
	int priority;
	boolean selectionStatus = false;
	
	public Process(int Pid, int arrivalTime, int burstTime){
		this.Pid = Pid;
		this.arrivalTime = arrivalTime;
		this.burstTime = burstTime;
	}
	
	public Process(int Pid, int arrivalTime, int burstTime, int priority){
		this.Pid = Pid;
		this.arrivalTime = arrivalTime;
		this.burstTime = burstTime;
		this.priority = priority;
	}
	
	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getCompletionTime() {
		return completionTime;
	}

	public void setCompletionTime(int completionTime) {
		this.completionTime = completionTime;
	}

	public boolean isSelectionStatus() {
		return selectionStatus;
	}

	public void setSelectionStatus(boolean selectionStatus) {
		this.selectionStatus = selectionStatus;
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getBurstTime() {
		return burstTime;
	}

	public void setBurstTime(int burstTime) {
		this.burstTime = burstTime;
	}

	public int getWaitingTime() {
		return waitingTime;
	}

	public void setWaitingTime(int waitingTime) {
		this.waitingTime = waitingTime;
	}

	public int getTurnAroundTime() {
		return turnAroundTime;
	}

	public void setTurnAroundTime(int turnAroundTime) {
		this.turnAroundTime = turnAroundTime;
	}

	@Override
	public String toString() {
		return "Process [Pid=" + Pid + ", arrivalTime=" + arrivalTime + ", burstTime=" + burstTime + ", waitingTime="
				+ waitingTime + ", turnAroundTime=" + turnAroundTime + ", completionTime=" + completionTime
				+ ", priority=" + priority + ", selectionStatus=" + selectionStatus + "]";
	}
	


	
}
