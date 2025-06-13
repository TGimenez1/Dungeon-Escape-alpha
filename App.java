package Dungeon_Escape;
import Dungeon_Escape.maths.*;

public class App {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        System.out.println(f1.toString() + " ou " + f1.toDouble());
        //Fraction f2 = new Fraction(1,0); Lance une exception
        Fraction f3 = new Fraction(42,30);
        System.out.println(f3.toString() + " ou " + f3.toDouble());
        Fraction f4 = new Fraction(-6,3);
        System.out.println(f4.toString() + " ou " + f4.toDouble());
        Fraction f5 = new Fraction(2,-6);
        System.out.println(f5.toString() + " ou " + f5.toDouble());
        System.out.println(f1.multiply(f3).toString()); // 7/10
        System.out.println(f1.add(f3).toString()); // 19/10
        System.out.println(f4.multiply(f5).toString()); // 2/3
        System.out.println(f4.add(f5).toString()); // -7/3
        Fraction f6 = new Fraction(-5,-10);
        System.out.println(f1.isequal((f5)));
        System.out.println(f1.isequal((f6)));
        System.out.println(f4.isgreater((f3)));
        System.out.println(f3.isgreater((f1)));
   }
}