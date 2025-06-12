// Player.java
public class Player {
    private final String name;
    private int hp;
    private final int MAX_HP = 100;

    public Player(String name) {
        this.name = name;
        this.hp = MAX_HP;
    }

    public void greet() {
        System.out.println("Bonjour, je suis " + name + " !");
        }

    public void takeDamage(int amount) {
        hp = Math.max(hp - amount, 0);
        System.out.println(name + " a " + hp + " points de vie !");
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public int getHp() {
        return this.hp;
    }

    public static void main(String[] args) {
        Player p = new Player("Elric");
        p.greet();
        p.takeDamage(85);
        assert p.isAlive();
        p.takeDamage(15);
        assert !p.isAlive() : "Elric aurait du etre KO";
    }
}