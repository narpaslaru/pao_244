package interfete.markers;

/**
 * Clasa Clonable cu un membru care nu este clonable
 *
 * Partea interesanta este la final
 */
public class AngajatClonabilCuDepartamentClonabil implements Cloneable {
    private String nume;
    private int varsta;
    private double salariu;
    private DepartamentClonabil departament;

    public AngajatClonabilCuDepartamentClonabil(String nume, int varsta, double salariu, DepartamentClonabil departament) {
        this.nume = nume;
        this.varsta = varsta;
        this.salariu = salariu;
        this.departament = departament;
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

    public DepartamentClonabil getDepartament() {
        return departament;
    }

    public void setDepartament(DepartamentClonabil departament) {
        this.departament = departament;
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
