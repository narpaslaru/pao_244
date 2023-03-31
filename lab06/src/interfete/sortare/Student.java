package interfete.sortare;

/**
 * Vom folosi sortare naturala (alfabetica) si sortare dupa alte criterii (medie, inaltime, etc.)
 */
public class Student implements Comparable<Student> {
    private String nume;
    private int varsta;
    private int inaltimeInCm;
    private float medie;

    public Student(String nume, int varsta, int inaltimeInCm, float medie) {
        this.nume = nume;
        this.varsta = varsta;
        this.inaltimeInCm = inaltimeInCm;
        this.medie = medie;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getInaltimeInCm() {
        return inaltimeInCm;
    }

    public float getMedie() {
        return medie;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", inaltimeInCm=" + inaltimeInCm +
                ", medie=" + medie +
                '}';
    }

    /**
     * Vom folosi compareTo() din clasa String aplicata la nume pentru sortarea alfabetica
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Student o) {
        return this.nume.compareTo(o.nume);
    }
}
