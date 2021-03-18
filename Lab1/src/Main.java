import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CalcWeight calc = new CalcWeight();
		UserWeight user = new UserWeight();
		
		Scanner weight = new Scanner(System.in);
		System.out.print("Enter Weight in Kilogram : ");
		double userWeight = weight.nextDouble();
		
		double marsW = calc.calcWeight(userWeight);
		user.insertData(userWeight, marsW);
		user.displayData();
	}
}
