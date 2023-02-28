public class Artefact {
    private String nom;
    private int bonus;
    
    public Artefact(String nom, int bonus) {
        this.nom = nom;
        this.bonus = bonus;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getBonus() {
        return bonus;
    }
    
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int size() {
        return 0;
    }

    public void add(Artefact artefact) {
    }

    public boolean contains(Artefact artefact) {
        return false;
    }

    public void remove(Artefact artefact) {
    }
}