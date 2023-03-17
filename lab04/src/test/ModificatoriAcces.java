package test;

public class ModificatoriAcces {
    private String nume;

    public ModificatoriAcces() {

    }

    public ModificatoriAcces(ModificatoriAcces ma) {
        ma.nume = "Cucu";
        ma = new ModificatoriAcces();
        ma.nume = "Alt nume";
        this.nume = ma.nume;
    }

    public ModificatoriAcces(String nume, String prenume) {
        this.nume = nume + " " + prenume;
    }

    public String stringPublic(){
        return "public";
    }

    protected String stringProtected() {
        return "protected";
    }

    private String stringPrivate() {
        return "private";
    }
    String stringDefault(){
        return "default";
    }

}
