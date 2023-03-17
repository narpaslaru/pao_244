package polimorfism;

import java.util.Date;

public class Card extends Posedat {
    private String numarCard;
    private Date expirare;

    public String getNumarCard() {
        return numarCard;
    }

    public void setNumarCard(String numarCard) {
        this.numarCard = numarCard;
    }

    public Date getExpirare() {
        return expirare;
    }

    public void setExpirare(Date expirare) {
        this.expirare = expirare;
    }
}
