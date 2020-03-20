package employees;

public class PartTime extends Employee{
	private int payPerTime;
	private int workTime;
	
	public PartTime(String name, int payPerTime, int workTime) {
		super(name);
		this.payPerTime=payPerTime;
		this.workTime=workTime;
	}

	public int getPayPerTime() {
		return payPerTime;
	}

	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}

	public int getWorkTime() {
		return workTime;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}
	
	public int pay() {
		return (payPerTime*workTime);
	}
	
	
}
