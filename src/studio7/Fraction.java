package studio7;

public class Fraction {
	private int numerator;
	private int denominator; 


	
	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraction f1 = new Fraction(1,3);
		Fraction f2 = new Fraction(4,6);
		
		System.out.println((double)(f1.numerator/f1.denominator) + (double)(f2.denominator/f2.denominator));
		
		
	}

}
