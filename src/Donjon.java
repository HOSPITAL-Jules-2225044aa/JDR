public class Donjon {
    private int Largeur; // taille en largeur de la carte
    private int Hauteur; // taille en hauteur de la carte
    private int[][] carte; // tableau à 2 dimensions représentant la carte
    private boolean bossBattu; // ajout de l'attribut boss a Battre
    
    public Donjon(int Largeur, int Hauteur) {
        this.Largeur = Largeur;
        this.Hauteur = Hauteur;
        this.carte = new int[Largeur][Hauteur];
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

    public int[][] getCarte() {
        return carte;
    }
    
    //permet de modifier la valeur d'une case spécifique de la carte
    
    public void setCase(int x, int y, int valeur) {
        carte[x][y] = valeur;
    }
    
    // permet d'obtenir la valeur d'une case spécifique.
    public int getCase(int x, int y) {
        return carte[x][y];
    }
    
    public void afficherCarte() {
        for (int i = 0; i < Hauteur; i++) {
            for (int j = 0; j < Largeur; j++) {
                System.out.print(carte[j][i] + " ");
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

    public void setCase(int x, int y, Case case1) {
    }
    
    /*
    initialisation de la carte avec des cases vides
    for (int x = 0; x < largeur; x++) {
        for (int y = 0; y < hauteur; y++) {
            carte[x][y] = new Case(false);
        }*/
    }
    
    