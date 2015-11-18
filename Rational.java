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
    
    public static void main(String[] args){
	Rational x = new Rational();
	Rational y = new Rational (3.5, 7);
	Rational z = new Rational (7, 3.5);
	System.out.println(toString(x.number));
	System.out.println(toString(y.number));
	System.out.println(toString(z.number));
    }
}

