package Dungeon_Escape.cards;

public abstract class Carte {
    protected final String nom;
    protected final int valeur;

    public Carte(String nom, int valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }

    public abstract void jouer();

    public String toString() {
        return "nom : " + this.nom + ", valeur : " + this.valeur;
    }

    public boolean equals(Carte other) {
        return this.nom == other.nom || this.valeur == other.valeur;
    }

}
