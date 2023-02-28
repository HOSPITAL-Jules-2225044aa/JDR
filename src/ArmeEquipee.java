public class ArmeEquipee {
    private Arme arme;

    public ArmeEquipee(Arme arme) {
        this.arme = arme;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public int getAttaque() {
        return arme.getAttaque();
    }

    public int getDegats() {
        return arme.getDegats();
    }

    public boolean estEquipee() {
        return true;
    }
}
