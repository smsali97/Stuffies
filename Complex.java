import java.util.InputMismatchException;
import java.util.Scanner;

public class Complex {
	private double real;
	private double imag;

	public Complex() {

	}

	public Complex(double real, double imag) throws InputMismatchException {
		this.real = real;
		this.imag = imag;

	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public String toString() {
		if (imag > 0)
			return "(" + real + "+" + imag + "i" + ")";
		else
			return "(" + real + imag + "i" + ")";
	}

	public boolean isReal() {
		if (imag == 0)
			return true;
		else
			return false;
	}

	public boolean isImaginary() {
		if (imag != 0)
			return true;
		else
			return false;
	}

	public boolean equals(double real, double imag) {
		if (real == real && imag == imag)
			return true;
		else
			return false;
	}

	public boolean equals(Complex complex) {
		if (real == complex.real && imag == complex.imag)
			return true;
		else
			return false;
	}

	public double magnitude() {
		return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
	}

	public double argument() {
		return Math.tan(imag / real);
	}

	public Complex add(Complex right) {
		real = real + right.real;
		imag = imag + right.imag;
		return this;
	}

	public Complex addNew(Complex right) {
		return new Complex(real + right.real, imag + right.imag);
	}

	public Complex subtract(Complex right) {
		real = real - right.real;
		imag = imag - right.imag;
		return this;
	}

	public Complex conjugate() {
		imag = imag * (-1);
		return this;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		Complex c1 = null;
		Complex c2 = null;
		while (flag == true) {
			try {

				c1 = new Complex(in.nextDouble(), in.nextDouble());
				c2 = new Complex(in.nextDouble(), in.nextDouble());
				flag = false;

			}

			catch (InputMismatchException e) {
				in.next();
				System.out.println("Wrong input given!");
			}

			catch (NullPointerException e) {
				in.next();
				System.out.println("Check the input again");
			} catch (Exception e) {
				in.next();
				System.out.println("please check your input again");
			}

			System.out.println(c1);
			System.out.println(c1.isReal());
			System.out.println(c1.isImaginary());
			System.out.println(c1.magnitude());
			System.out.println(c1.argument());
			System.out.println(c1.add(c2));
			System.out.println(c1.addNew(c2));
			System.out.println(c1.conjugate());
			in.close();
		}
	}
}