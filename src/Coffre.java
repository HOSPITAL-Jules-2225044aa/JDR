public class Coffre {
    private Arme arme;
    private Potion potion;

    public Coffre(Arme arme, Potion potionDeSoin) {
        this.arme = arme;
        this.potion = potionDeSoin;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public Potion getArtefact() {
        return potion;
    }

    public void setPotion(Potion potion) {
        this.potion = potion;
    }
}