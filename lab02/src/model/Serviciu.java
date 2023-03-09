package model;

public class Serviciu extends Produs {
    private Long durataInMillis;

    public Serviciu(Integer idProdus, String numeProdus, Categorie categorie, Long durataInMillis) {
        super(idProdus, numeProdus, categorie);
        this.durataInMillis = durataInMillis;
    }
}
