package interfete.markers;

/**
 * Clasa simpla cu atribute private, getters, setters si constructor cu toti membrii
 * Folositi Alt+Insert pentru a genera codul pentru aceste metode clasice
 *
 * Partea interesanta este la final
 */
public class AngajatClonabil implements Cloneable {
    private String nume;
    private int varsta;
    private double salariu;

    public AngajatClonabil(String nume, int varsta, double salariu) {
        this.nume = nume;
        this.varsta = varsta;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    /**
     * Suprascriem metoda clone() din clasa Object pentru a putea executa cod atunci cand se face clonarea de catre JVM
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
