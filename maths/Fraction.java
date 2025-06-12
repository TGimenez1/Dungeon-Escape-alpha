package Dungeon_Escape.maths;

public class Fraction {
    private int num; // numérateur
    private int den; // dénominateur (>0)

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        int newnum = MathUtils.pgcd(num,den);
        num /= newnum;
        den /= newnum;
        if (den <= 0) {
            throw new IllegalArgumentException("Le dénominateur doit être strictement positif");
        }
        System.out.println("Fraction : " + num + "/" + den);
    }

   public static void main(String[] args) {

   Fraction f1 = new Fraction(1,2);
   //Fraction f2 = new Fraction(1,0); Lance une exception
   Fraction f3 = new Fraction(42,30);
   Fraction f4 = new Fraction(-6,3);
   Fraction f5 = new Fraction(6,-3); //Affiche -2/1 aussi
   }
}