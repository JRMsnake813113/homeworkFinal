package homeworkFinal;

public class BulkDiscount extends DiscountPolicy {
	
	private int minimum;
	private double percent;
	
	public BulkDiscount(int theMinimum,double thePercent){
		
		minimum = theMinimum;
		percent = thePercent;
	}
	
	@Override
	public double computeDiscount(int count, double itemCost) {
		double discount =0.0;
		if(count>minimum){
			discount= count*itemCost*percent/100;
		}
		return discount;
	}
}