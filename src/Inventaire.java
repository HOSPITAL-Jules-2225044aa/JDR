import java.util.ArrayList;

public class Inventaire {
    private ArrayList<Arme> armes;
    private ArrayList<Artefact> artefacts;
    private ArrayList<Potion> potions;
    
    public Inventaire() {
        this.armes = new ArrayList<>();
        this.artefacts = new ArrayList<>();
        this.potions = new ArrayList<>();
    }
    
    
    public void ajouterArtefact(Artefact artefact) {
        artefacts.add(artefact);
    }
    
    public void ajouterPotion(Potion potion) {
        potions.add(potion);
    }
    
    public int getNbArmes() {
        return armes.size();
    }
    
    public int getNbArtefacts() {
        return artefacts.size();
    }
    
    public int getNbPotions() {
        return potions.size();
    }
    
    
    public Arme getArme(int index) {
        return armes.get(index);
    }
    
    public Artefact getArtefact(int index) {
        return artefacts.get(index);
    }
    
    public Potion getPotion(int index) {
        return potions.get(index);
    }


    public Arme getArmeEquipee() {
        return null;
    }
    
}
