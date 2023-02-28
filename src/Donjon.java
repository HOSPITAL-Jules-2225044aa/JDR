public class Donjon {
    private int Largeur; // taille en largeur de la carte
    private int Hauteur; // taille en hauteur de la carte
    private Case[][] carte; // tableau à 2 dimensions représentant la carte
    private boolean bossBattu; // ajout de l'attribut boss a Battre
    public Donjon(int Largeur, int Hauteur) {
        this.Largeur = Largeur;
        this.Hauteur = Hauteur;
        this.carte = new Case[Largeur][Hauteur];
        initialiserCarte();
        this.bossBattu = false; // initialisation à false
    }
    
    public int getLargeur() {
        return Largeur;
    }
    
    public void setLargeur(int valeur) {
        Largeur = valeur;
    }
    
    public int getHauteur() {
        return Hauteur;
    }
    
    public void setHauteur(int valeur) {
        Hauteur = valeur;
    }
    
    public Case[][] getCarte() {
        return carte;
    }
    
    //permet de modifier la valeur d'une case spécifique de la carte
    
    public void setCase(int x, int y, Case case1) {
        carte[x][y] = case1;
    }
    
    // permet d'obtenir la valeur d'une case spécifique.
    public Case getCase(int x, int y) {
        return carte[x][y];
    }
    
    public void afficherCarte() {
        for (int i = 0; i < Hauteur; i++) {
            for (int j = 0; j < Largeur; j++) {
                System.out.print(carte[j][i].estVide() ? " " : carte[j][i].getSymbole() + " ");
            }
            System.out.println();
        }
    }
    
    public boolean isBossBattu() {
        return bossBattu;
    }
    
    public void setBossBattu(boolean bossBattu) {
        this.bossBattu = bossBattu;
    }
    
    //initialisation de la carte avec des cases vides
    public void initialiserCarte() {
        for (int x = 0; x < Largeur; x++) {
            for (int y = 0; y < Hauteur; y++) {
                carte[x][y] = new Case(true);
            }
        }
    }

    public void setCase(int x, int y, int i) {
    }
}