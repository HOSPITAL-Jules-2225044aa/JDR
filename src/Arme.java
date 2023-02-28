public class Arme {
    private String nom;
    private int attaque;
    private int degats;
    
    public Arme(String nom, int attaque, int degats) {
        this.nom = nom;
        this.attaque = attaque;
        this.degats = degats;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getAttaque() {
        return attaque;
    }
    
    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int size() {
        return 0;
    }

    public boolean contains(Arme arme) {
        return false;
    }

    public void remove(Arme arme) {
    }

    public void add(Arme arme) {
    }
    
    
    public int getDegats() {
        return degats;
    }
}