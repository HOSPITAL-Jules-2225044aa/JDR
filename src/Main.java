import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Donjon donjon = new Donjon(5, 5); // création d'un donjon de 5x5 cases
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nom d'un personnage");
        String nom = sc.nextLine();

        System.out.print("Entrez la classe de votre personnage entre : hololive/même/OC(Original Character)");
        String classe = sc.nextLine();

        Waifu joueur = new Waifu(nom, 10, 8, 20, 100, classe, "canard",  "humain");
        Simp padoru = new Simp("padoru", 6, 4, 2, 50, "même", "rien", "hololive");
        
        Arme batte = new Arme("Batte de subaru", 10);
        Potion potionDeSoin = new Potion("Potion de soin", 50);
        Potion grandePotionDeSoin = new Potion("Grande potion de soin", 100);
        Artefact ShubaDePoche = new Artefact("Augmente la force de son porteur", 10);
        
        
        Coffre coffreboss = new Coffre(batte,grandePotionDeSoin);
        donjon.setCase(3, 3, new Case(Case.Coffre));
        
        // remplissage de la carte avec des valeurs représentant les éléments du jeu
        donjon.setCase(0, 0, 1); 
        donjon.setCase(0, 1, 1); 
        donjon.setCase(0, 2, 0); 
        donjon.setCase(0, 3, 2); 
        donjon.setCase(0, 4, 0);
        
        donjon.setCase(1, 0, 0); 
        donjon.setCase(1, 1, 0); 
        donjon.setCase(1, 2, 0); 
        donjon.setCase(1, 3, 3); 
        donjon.setCase(1, 4, 0);         
        
        donjon.setCase(2, 0, 0);
        donjon.setCase(2, 1, 0); 
        donjon.setCase(2, 2, 1); 
        donjon.setCase(2, 3, 0); 
        donjon.setCase(2, 4, 0); 
        
        donjon.setCase(3, 0, 0); 
        donjon.setCase(3, 1, 0); 
        donjon.setCase(3, 2, 0);
        donjon.setCase(3, 3, 0);
        donjon.setCase(3, 4, 0); 
        
        donjon.setCase(4, 0, 0);
        donjon.setCase(4, 1, 0); 
        donjon.setCase(4, 2, 1); 
        donjon.setCase(4, 3, 4); 
        donjon.setCase(4, 4, 1); 
        
        donjon.afficherCarte();   
        
        //seDeplacer(direction);
        
        
        /*
        // Remplissage de la carte avec des murs automatique 
        for (int i = 0; i < donjon.getTailleX(); i++) {
            donjon.setCase(i, 0, 1);
            donjon.setCase(i, donjon.Largeur() - 1, 1);
        }
        for (int i = 0; i < donjon.Largeur(); i++) {
            donjon.setCase(0, i, 1);
            donjon.setCase(donjon.getTailleX() - 1, i, 1);
        }
        
        // Placement des ennemis
        donjon.setCase(2, 2, 2);
        donjon.setCase(4, 4, 2);
        donjon.setCase(4, 2, 2);
        */
    }
    
    public void seDeplacer(Donjon donjon, Scanner sc) {
        System.out.print("Entrez la direction de déplacement (haut, bas, gauche, droite) : ");
        String direction = sc.nextLine();
        
        switch (direction) {
            case "haut":
            if (donjon.getLargeur()> 0 && donjon.getCase(donjon.getLargeur() - 1, donjon.getHauteur()) != 0) {
                donjon.setLargeur(donjon.getLargeur()-1);
                System.out.println("Déplacement effectué vers le haut");
            } else {
                System.out.println("Déplacement impossible");
            }
            break;
            case "bas":
            if (donjon.getLargeur() < donjon.getLargeur() - 1 && donjon.getCase(donjon.getLargeur() + 1, donjon.getHauteur()) != 0) {
                donjon.setLargeur(donjon.getLargeur()+1);
                System.out.println("Déplacement effectué vers le bas");
            } else {
                System.out.println("Déplacement impossible");
            }
            break;
            case "gauche":
            if (donjon.getLargeur() > 0 && donjon.getCase(donjon.getLargeur(), donjon.getHauteur() - 1) != 0) {
                donjon.setHauteur(donjon.getHauteur()-1);
                System.out.println("Déplacement effectué vers la gauche");
            } else {
                System.out.println("Déplacement impossible");
            }
            break;
            case "droite":
            if (donjon.getHauteur() < donjon.getLargeur() - 1 && donjon.getCase(donjon.getLargeur(), donjon.getHauteur() + 1) != 0) {
                donjon.setHauteur(donjon.getLargeur()+1);
                System.out.println("Déplacement effectué vers la droite");
            } else {
                System.out.println("Déplacement impossible");
            }
            break;
            default:
            System.out.println("Direction invalide");
            break;
        }
    }
    
    public void placerArtefactAleatoire(Artefact artefact) {
        Random rand = new Random();
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        Object[][] carte;
        //détecter si la case est vide ou non
        while (carte[x][y] != Case.vide) {
            x = rand.nextInt(10);
            y = rand.nextInt(10);
        }
        Object[][] cases;
        cases[x][y].setArtefact(artefact);
    }
}
