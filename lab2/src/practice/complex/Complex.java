package practice.complex;

//Alt+insert intellij -> generate getters and setters, etc
public class Complex {

    private int realPart;
    private int imaginaryPart;

    public Complex() {
        this(0,0);
    }

    public Complex(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void addWithComplex(Complex complex) {
        this.realPart += complex.realPart;
        this.imaginaryPart += complex.imaginaryPart;
    }

    public static Complex sumOfComplex(Complex complex1, Complex complex2) {
        Complex result = new Complex(complex1.realPart + complex2.realPart,
                complex1.imaginaryPart + complex2.imaginaryPart);

        return result;
    }

    public void showNumber() {
        System.out.println("Real part: " + this.realPart + "; Imaginary part: " + this.imaginaryPart);
    }

    public int getRealPart() {
        return realPart;
    }

    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }

    public int getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
}
