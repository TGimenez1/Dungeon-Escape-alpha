package Dungeon_Escape.cards;

public class CarteChiffre extends Carte {
    private final String couleur;

    public CarteChiffre(String couleur, int valeur) {
        super(valeur + " de " + couleur, valeur);
        this.couleur = couleur;
    }

    @Override
    public void jouer() {
        System.out.println("Je joue le " + this.nom);
    }

    @Override
    public String toString() {
        return this.valeur + " de " + this.couleur;
    }

}