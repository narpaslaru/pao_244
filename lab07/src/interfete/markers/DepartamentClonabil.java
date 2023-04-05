package interfete.markers;

public class DepartamentClonabil implements Cloneable {
    private int id;
    private String denumire;

    public DepartamentClonabil(int id, String denumire) {
        this.id = id;
        this.denumire = denumire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
