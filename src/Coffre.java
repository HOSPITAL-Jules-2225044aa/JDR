public class Coffre {
    private Arme arme;
    private Potion potion;
    private Artefact artefact;

    public Coffre(Arme arme, Potion potion) {
        this.arme = arme;
        this.potion = potion;
    }
    
    public void setCoffreItem(Arme arme, Artefact artefact) {
        this.arme = arme;
        this.artefact = artefact;
    }
    
    public void setCoffreSoin(Potion potion, Artefact artefact) {
        this.potion = potion;
        this.artefact = artefact;
    }
    
    public Arme getArme() {
        return arme;
    }
    
    public void setArme(Arme arme) {
        this.arme = arme;
    }
    
    public Potion getPotion() {
        return potion;
    }
    
    public void setPotion(Potion potion) {
        this.potion = potion;
    }
    
}