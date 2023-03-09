package model;

import java.util.Objects;

public class Categorie {
    private Integer idCategorie;
    private String numeCategorie;
    private Categorie parinte;

    public Categorie(Integer idCategorie, String numeCategorie, Categorie categorieParinte) {
        this.idCategorie = idCategorie;
        this.numeCategorie = numeCategorie;
        this.parinte = categorieParinte;

    }

    @Override
    public String toString() {
        return "Categorie{" +
                "idCategorie=" + idCategorie +
                ", numeCategorie='" + numeCategorie + '\'' +
                ", parinte=" + parinte +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categorie categorie = (Categorie) o;
        return Objects.equals(idCategorie, categorie.idCategorie) && Objects.equals(numeCategorie, categorie.numeCategorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategorie, numeCategorie);
    }
}
