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
        
        Arme batte = new Arme("Batte de subaru", 10,10);
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
        
        seDeplacer(donjon, sc);
        
        
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
    
    public void seDeplacer(String direction, Donjon donjon) {
        int x;
        int nouveauX = x;
        int y;
        int nouveauY = y;
        
        // Modifier les coordonnées en fonction de la direction choisie
        switch (direction) {
            case "haut":
                nouveauY--;
                break;
            case "bas":
                nouveauY++;
                break;
            case "gauche":
                nouveauX--;
                break;
            case "droite":
                nouveauX++;
                break;
            default:
                System.out.println("Direction non valide");
                return;
        }
        
        // Vérifier que les nouvelles coordonnées sont valides
        if (nouveauX < 0 || nouveauX >= donjon.getLargeur() || nouveauY < 0 || nouveauY >= donjon.getHauteur()) {
            System.out.println("Déplacement impossible, vous êtes en dehors de la carte");
            return;
        }
        
        // Vérifier que la case est accessible
        Case nouvelleCase = donjon.getCase(nouveauX, nouveauY);
        if (!nouvelleCase.estAccessible()) {
            System.out.println("Déplacement impossible, la case est occupée");
            return;
        }
        
        // Déplacer le personnage
        donjon.setCase(x, y, new Case(true)); // libérer l'ancienne case
        x = nouveauX;
        y = nouveauY;
        donjon.setCase(x, y, new Case(false)); // occuper la nouvelle case
        
        // Afficher la carte mise à jour
        donjon.afficherCarte();
        
        // Vérifier si le joueur a atteint le boss
        if (nouvelleCase.getSymbole() == 'B') {
            if (donjon.isBossBattu()) {
                System.out.println("Vous avez déjà vaincu le boss !");
            } else {
                System.out.println("Vous avez atteint le boss ! Préparez-vous à combattre !");
                donjon.setBossBattu(true);
            }
        }
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
        getCase(x,y).setArtefact(artefact);
    }
}
