package Dungeon_Escape.maths;

public class Fraction {
    private int num; // numérateur
    private int den; // dénominateur (>0)

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        this.simplify();
        // Une fraction ne peut exister que sous forme simplifiée
        if (this.den <= 0) {
            throw new IllegalArgumentException("Le dénominateur doit être strictement positif");
        }
    }

    public Fraction simplify() {
        if (den < 0) {
            this.num *= -1;
            this.den *= -1;
        }
        int newnum = MathUtils.pgcd(this.num,this.den);
        newnum = Math.abs(newnum); //Comme ça le dénominateur sera toujours positif
        this.num /= newnum;
        this.den /= newnum;
        return this;
    }

    public Fraction add(Fraction other) {
        return new Fraction(this.num * other.den + other.num * this.den, this.den * other.den);
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(this.num * other.num, this.den * other.den);
    }

    public boolean isequal(Fraction other) {
        return (this.num == other.num && this.den == other.den);
    }

    public boolean isgreater(Fraction other) {
        //Strictly
        return this.toDouble() > other.toDouble();
    }

    public double toDouble() {
        return (double)this.num / this.den;
    }

    public String toString() {
        return this.num + "/" + this.den;
    }

}