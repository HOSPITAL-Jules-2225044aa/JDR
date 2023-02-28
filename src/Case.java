public class Case {
    public static final boolean Coffre = false;
    public static Object vide;
    private boolean passable;
    private boolean ennemiBattu; // ajout de l'attribut ennemiBattu
    
    public Case(boolean passable) {
        this.passable = passable;
        this.ennemiBattu = false; // initialisation à false
    }
    
    // getters et setters pour passable et ennemiBattu
    public boolean isPassable() {
        return passable;
    }
    
    public void setPassable(boolean passable) {
        this.passable = passable;
    }
    
    public boolean isEnnemiBattu() {
        return ennemiBattu;
    }
    
    public void setEnnemiBattu(boolean ennemiBattu) {
        this.ennemiBattu = ennemiBattu;
    }
    
    public boolean estVide() {
        return (this == vide);
    }
    
    public String getSymbole() {
        if (this == vide) {
            return ".";
        } else if (passable && !ennemiBattu) {
            return " ";
        } else if (passable && ennemiBattu) {
            return "X";
        } else {
            return "#";
        }
    }

    public boolean estAccessible() {
        return false;
    }
}