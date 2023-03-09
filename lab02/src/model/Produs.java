package model;

import java.util.Objects;

public class Produs {
    private Integer idProdus;
    private Boolean activ;
    private String numeProdus;
    private Integer pret;
    private Categorie categorie;

    public Produs(Integer idProdus, String numeProdus, Categorie categorie) {
        this.idProdus = idProdus;
        this.numeProdus = numeProdus;
        this.activ = true;
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "idProdus=" + idProdus +
                ", activ=" + activ +
                ", numeProdus='" + numeProdus + '\'' +
                ", categorie=" + categorie +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produs produs = (Produs) o;
        return Objects.equals(idProdus, produs.idProdus) && Objects.equals(activ, produs.activ) && Objects.equals(numeProdus, produs.numeProdus) && Objects.equals(pret, produs.pret) && categorie.equals(produs.categorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProdus, activ, numeProdus, pret, categorie);
    }
}
