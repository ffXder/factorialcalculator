import java.util.Scanner;
public class kineticEnergy {
	public static void main(String[] args) {
		
		Scanner ff = new Scanner (System.in);
		
		double x;
		double y;
		double KE;
		
		System.out.print("Enter the mass of the object: ");
		x = ff.nextDouble();
		System.out.print("Enter velocity in meters per second: ");
		y = ff.nextDouble();
		
		KE = formulaOfKineticEnegery(x, y);
		System.out.println("The object's kinetic energy is: "+ String.format("%.2f", KE) + "J");
	}
	//method indicate the function and parameters
	public static double formulaOfKineticEnegery(double mass, double velocity) {
		return 1.0/2.0 * mass * velocity;
	}
}
