package Dungeon_Escape.maths;

public class Fraction {
    private int num; // numérateur
    private int den; // dénominateur (>0)

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        int newnum = MathUtils.pgcd(this.num,this.den);
        newnum = Math.abs(newnum); //Comme ça le dénominateur sera toujours positif
        this.num /= newnum;
        this.den /= newnum;
        if (this.den <= 0) {
            throw new IllegalArgumentException("Le dénominateur doit être strictement positif");
        }
    }

/*     public Fraction add(Fraction other) {

    }

    public Fraction multiply(Fraction other) {
        
    } */
    public double toDouble() {
        return (double)this.num / this.den;
    }

    public String toString() {
        return this.num + "/" + this.den;
    }


}