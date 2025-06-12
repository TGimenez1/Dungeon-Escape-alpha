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

   public static void main(String[] args) {

   Fraction f1 = new Fraction(1,2);
   System.out.println(f1.toString() + " ou " + f1.toDouble());
   //Fraction f2 = new Fraction(1,0); Lance une exception
   Fraction f3 = new Fraction(42,30);
   System.out.println(f3.toString() + " ou " + f3.toDouble());
   Fraction f4 = new Fraction(-6,3);
   System.out.println(f4.toString() + " ou " + f4.toDouble());
   Fraction f5 = new Fraction(-2,6);
   System.out.println(f5.toString() + " ou " + f5.toDouble());
   }
}