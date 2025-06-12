package Dungeon_Escape.maths;

public class MathUtils {
    
    public static int pgcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
