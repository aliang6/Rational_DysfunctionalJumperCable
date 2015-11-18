/* Andy Liang, Jason Dong - Team DysfunctionalJumperCable
   APCS1 pd5
   HW 32 -- Irrationality Stops Here
   2015-11-17 */

public class Rational{

    public double numerator, denominator, number;
    
    public Rational(){
	numerator = 0;
	denominator = 1;
	number = numerator/denominator;
    }

    public Rational(double numerator, double denominator){
        if(denominator == 0){
	    System.err.println("Cannot divide by 0");
	    numerator = 0;
	    denominator = 1;
	    number = numerator / denominator;
	}
	else{
	    number = numerator/denominator;
	}
    }

    public static String toString(double x){
	return Double.toString(x);
    }

    public double floatValue () {
	return number;
    }

    public void multiply ( Rational multiple ) {
	
	numerator = numerator * multiple.numerator;
	denominator = denominator * multiple.denominator;
	number = number * multiple.number;

    }

    public void divide ( Rational divisor ) {
	
	numerator = numerator * divisor.denominator;
	denominator = denominator * divisor.numerator;
	number = number / divisor.number;

    }
    
    public static void main(String[] args){
	Rational x = new Rational();
	Rational y = new Rational (3.5, 7);
	Rational z = new Rational (7, 3.5);
	System.out.println(toString(x.number));
	System.out.println(toString(y.number));
	System.out.println(toString(z.number));
	System.out.println(x.floatValue());
	System.out.println(y.floatValue());
	System.out.println(z.floatValue());

	x.multiply(y);

	System.out.println(y.numerator + "," + y.denominator + "," + y.number);

	z.divide(y);

	System.out.println(y.numerator + "," + y.denominator + "," + y.number);

    }
}

