
public class Complex_number {
	double real;
	double imag;
	
	Complex_number(double real,double imag){
		this.imag=imag;
		this.real=real;
	}
	
	void sum(Complex_number c) {
		double realpart = real + c.real;
		double imaginarypart = imag + c.imag;
		System.out.println("Addition is " + realpart + " " + imaginarypart + "i");
	}
	
	void product(Complex_number c) {
		double realpart = real * c.real;
		double imaginarypart = imag * c.imag;
		System.out.println("Product is " + realpart + " " + imaginarypart + "i");
	}
	
	void diff(Complex_number c) {
		double realpart = real - c.real;
		double imaginarypart = imag - c.imag;
		System.out.println("The difference in " + realpart + " " + imaginarypart + "i");
	}
	
	
	

	public static void main(String[] args) {
		
		System.out.println("enter 1st real");
		double real1 = ConsoleInput.getInt();
		
		System.out.println("enter 1st imagenary");
		double imag1 = ConsoleInput.getInt();
		
		System.out.println("enter 2nd real");
		double real2 = ConsoleInput.getInt();
		
		System.out.println("enter 2nd imagenary");
		double imag2 = ConsoleInput.getInt();

		Complex_number c1 = new Complex_number(real1,imag1);
		Complex_number c2 = new Complex_number(real2,imag2);
		
		c1.sum(c2);
		c1.diff(c2);
		c1.product(c2);
	}

}
