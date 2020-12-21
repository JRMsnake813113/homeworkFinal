package homeworkFinal;

public class HazardPay extends PayCalculator {

	public HazardPay(double theRate) {
		super(theRate);
	}

	public double getPay(double hours){
		return super.getPay(hours)*1.5;
	}
}
