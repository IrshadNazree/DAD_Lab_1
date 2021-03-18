import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CalcWeight calc = new CalcWeight();
		
		Scanner weight = new Scanner(System.in);
		System.out.print("Enter Weight in Kilogram : ");
		double userWeight = weight.nextDouble();
		
		calc.calcWeight(userWeight);
	}
}
