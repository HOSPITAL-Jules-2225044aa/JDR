public class Potion {
    private String nom;
    private int soin;

    public Potion(String nom, int soin) {
        this.nom = nom;
        this.soin = soin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSoin() {
        return soin;
    }

    public void setSoin(int soin) {
        this.soin = soin;
    }

    public String getEffet() {
        return null;
    }

    public int getType() {
        return 0;
    }

    public int size() {
        return 0;
    }

    public void add(Potion potion) {
    }

    public boolean contains(Potion potion) {
        return false;
    }

    public void remove(Potion potion) {
    }
}
