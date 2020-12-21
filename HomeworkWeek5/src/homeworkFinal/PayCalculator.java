package homeworkFinal;

public abstract class PayCalculator{

	private double payRate;
	
	
	public double getPay(double hours){
		return hours*payRate;
	}
	
	
	public PayCalculator(double theRate){
		payRate=theRate;
	}

	
	public double getPayRate(){
		return payRate;
	}

	
	public void setPayRate(double payRate){
		this.payRate = payRate;
	}
	
}
