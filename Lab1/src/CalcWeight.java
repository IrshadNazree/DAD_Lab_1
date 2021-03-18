import java.text.DecimalFormat;

public class CalcWeight {
	static double earthGrav = 9.81;
	static double marsGrav = 3.711;
	
	public void calcWeight(double w) {
	
		double marsWeight = (w/earthGrav) * marsGrav;	
		
		DecimalFormat df = new DecimalFormat("#.##");
		String mW = df.format(marsWeight); 
		String eW = df.format(w); 
		System.out.println("Your Weight in Mars is " + eW + "KG");
		System.out.println("Your Weight in Mars is " + mW + "KG");
	}
}
