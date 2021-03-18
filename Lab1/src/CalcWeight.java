public class CalcWeight {
	static double earthGrav = 9.81;
	static double marsGrav = 3.711;
	
	public double calcWeight(double w) {
	
		double marsWeight = (w/earthGrav) * marsGrav;	
		return marsWeight;
	}
}
