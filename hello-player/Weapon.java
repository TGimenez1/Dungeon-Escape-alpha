import java.util.Random;

public class Weapon {
    private int minDamage = 8;
    private int maxDamage = 12;

        
    public Weapon() {
    }

    public int rollDamage() {
        Random rand = new Random();
        return rand.nextInt(maxDamage - minDamage + 1) + minDamage;
    }

        public static void main(String[] args) {
        Weapon p = new Weapon();
        System.out.println(p.rollDamage());
    }
}
