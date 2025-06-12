// Player.java
public class Player {
    private final String name;
    private int hp;

    public Player(String name) {
        this.name = name;
        this.hp = 100;
    }

    public void greet() {
        System.out.println("Bonjour, je suis "
    + name + " !");
        }

    public void takeDamage(int amount) {
        this.hp = this.hp - amount;
        if (this.hp < 0) {
            this.hp = 0;
        }
        System.out.println(name + " a "
    + hp + " points de vie !");
    }

    public boolean isAlive() {
        return hp > 0;
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