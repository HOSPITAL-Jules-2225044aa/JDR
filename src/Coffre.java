public class Coffre {
    private Arme arme;
    private Artefact artefact;

    public Coffre(Arme arme, Artefact artefact) {
        this.arme = arme;
        this.artefact = artefact;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public Artefact getArtefact() {
        return artefact;
    }

    public void setArtefact(Artefact artefact) {
        this.artefact = artefact;
    }
}