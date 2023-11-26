public class MonthlyPay {
	public static void main (String[]args) {
	String employeeName = "Jess Diaz";
	double grossPay = 25000.0;
	double wTax = 3750;
	double SSS = 907.5;
	double medicare = 312.5;
	double pagibig = 100.0;
	double netPay;
	
	System.out.println("Employee Name: " + "         " + employeeName);
	System.out.println("Gross Pay: " + "             " + grossPay);
	System.out.println("----------------------------------");
	System.out.println("Deductions" + "              " + "Amount");
	System.out.println("Withholding Tax: " + "       " + wTax);
	System.out.println("SSS Contribution: " + "      " + SSS);
	System.out.println("Medicare: " + "              " + medicare);
	System.out.println("Pagibig Contribution:   " + pagibig);
	System.out.println("----------------------------------");
	netPay = grossPay - (wTax + SSS + medicare + pagibig );
	
	System.out.println("Net Pay: " + "               " + netPay);
	
	
	}
}
