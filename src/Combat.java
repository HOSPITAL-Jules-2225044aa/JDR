import java.util.Scanner;

public class Combat {
    private Waifu joueur;
    private Simp ennemi;
    private Scanner scanner;
    
    public Combat(Waifu joueur, Simp ennemi) {
        this.joueur = joueur;
        this.ennemi = ennemi;
        this.scanner = new Scanner(System.in);
    }
    
    public void commencerCombat() {
        System.out.println("Un ennemi " + ennemi.getType() + " apparaît !");
        boolean joueurCommence = (joueur.getVelocite() > ennemi.getVelocite());
        while (joueur.getPointDeVie() > 0 && ennemi.getPointDeVie() > 0) {
            if (joueurCommence) {
                tourJoueur();
                tourEnnemi();
            } else {
                tourEnnemi();
                tourJoueur();
            }
        }
        if (joueur.getPointDeVie() <= 0) {
            System.out.println("Vous avez perdu !");
        } else {
            System.out.println("Vous avez vaincu l'ennemi " + ennemi.getType() + " !");
        }
    }
    
    private void tourJoueur() {
        System.out.println("C'est à votre tour !");
        System.out.println("Que souhaitez-vous faire ?");
        System.out.println("1. Attaquer");
        if (joueur.getInventaire().getNbPotions() > 0) {
            System.out.println("2. Prendre une potion");
        }
        int choix = scanner.nextInt();
        if (choix == 1) {
            joueur.attaquer(ennemi);
            System.out.println("Vous avez infligé " + joueur.getArmeEquipee().getDegats() + " points de dégâts à l'ennemi !");
        } else if (choix == 2) {
            Potion potion = choisirPotion();
            joueur.utiliserPotion(potion);
            System.out.println("Vous avez utilisé une potion et avez récupéré " + potion.getEffet() + " points de vie.");
        } else {
            System.out.println("Choix invalide !");
            tourJoueur();
        }
    }
    
    private void tourEnnemi() {
        if (ennemi.getPointDeVie() > 0) {
            ennemi.attaquer(joueur);
            System.out.println("L'ennemi " + ennemi.getType() + " vous a infligé " + ennemi.getArmeEquipee().getDegats() + " points de dégâts !");
        }
    }
    
    private Potion choisirPotion() {
        System.out.println("Quelle potion souhaitez-vous utiliser ?");
        Inventaire inventaire = joueur.getInventaire();
        int nbPotions = inventaire.getNbPotions();
        for (int i = 0; i < nbPotions; i++) {
            Potion potion = inventaire.getPotion(i);
            System.out.println((i+1) + ". " + potion.getType() + " (" + potion.getEffet() + " points de vie)");
        }
        int choix = scanner.nextInt();
        if (choix < 1 || choix > nbPotions) {
            System.out.println("Choix invalide !");
            return choisirPotion();
        } else {
            return inventaire.getPotion(choix - 1);
        }
    }
}
