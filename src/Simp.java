public class Simp {
    private String nom;
    private int attaque;
    private int defense;
    private int pointDeVie;
    private int velocite;
    private String type;
    private String avantage;
    private String desavantage;
    
    public Simp(String nom, int attaque, int defense, int pointDeVie, int velocite, String type, String avantage, String desavantage) {
        this.nom = nom;
        this.attaque = attaque;
        this.defense = defense;
        this.pointDeVie = pointDeVie;
        this.velocite = velocite;
        this.type = type;
        this.avantage = avantage;
        this.desavantage = desavantage;
    }

    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getAttaque() {
        return attaque;
    }
    
    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }
    
    public int getDefense() {
        return defense;
    }
    
    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    public int getPointDeVie() {
        return pointDeVie;
    }
    
    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }
    
    public int getVelocite() {
        return velocite;
    }
    
    public void setVelocite(int velocite) {
        this.velocite = velocite;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getAvantage() {
        return avantage;
    }
    
    public void setAvantage(String avantage) {
        this.avantage = avantage;
    }
    
    public String getDesavantage() {
        return desavantage;
    }
    
    public void setDesavantage(String desavantage) {
        this.desavantage = desavantage;
    }

    public void attaquer(Waifu joueur) {
    }

    public Object getArmeEquipee() {
        return null;
    }
}