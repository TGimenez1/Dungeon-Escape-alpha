package Dungeon_Escape.maths;

public class Fraction {
/*     private final int num; // numérateur
    private final int den; // dénominateur (>0)
    public Fraction(int num, int den) {
        // TODO: simplifier la fraction avec pgcd
        // TODO: gérer den == 0 (IllegalArgumentException)
    } */
   
   public static void main(String[] args) {
   MathUtils calcul = new MathUtils();
   System.out.println(calcul.pgcd(42, 30));
   }
}