public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        return (double) this.numerator / this.denominator;
    }

    public String print() {
        return this.numerator + " / " + this.denominator;
    }

    public Bruch multiplicate(Bruch b2) {
        Bruch result = new Bruch(this.numerator*b2.getNumerator(), this.denominator*b2.getDenominator());
        return result;
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        Bruch result = new Bruch(this.numerator*b2.getNumerator()*b3.getNumerator(), this.denominator*b2.getDenominator()*b3.getDenominator());
        return result;
    }
}
