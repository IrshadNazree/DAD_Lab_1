import java.text.DecimalFormat;

public class UserWeight {
	double[] earthW = new double[10];
	double[] marsW = new double[10];;
	
	public void insertData(double ew, double mw) {
		earthW[0] = ew;
		marsW[0] = mw;
	}
	
	public void displayData() {
		DecimalFormat df = new DecimalFormat("#.##");
		String eW = df.format(earthW[0]); 
		String mW = df.format(marsW[0]); 
		System.out.println("Your Weight in Earth is " + eW + "KG");
		System.out.println("Your Weight in Mars is " + mW + "KG");
	}
}
