package interfete.basic;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

/**
 * O implementare clasica a unei intefete - suntem obligati sa implementam toate metodele abstracte
 * provenite din toate interfetele implementate (in cazul nostru {@link BasicInterfaceExample} si
 * {@link java.io.Serializable} (0 metode) si {@link Comparable} (1 metoda)
 */
public class BasicImplementationExample implements BasicInterfaceExample {
    @Override
    public void metodaImplicita(String test) {
        System.out.println("Metoda implicita");
    }

    @Override
    public String metodaPublica() {
        return "Metoda Publica";
    }

    @Override
    public Integer abstractMethod(int i) {
        return 3;
    }

    @Override
    public BigDecimal publicAbstractMethod(double d) {
        return BigDecimal.valueOf(d);
    }

    @Override
    public int getRang() {
        return ThreadLocalRandom.current().nextInt(1, 11);
    }

    /**
     * Aceasta metoda va fi folosita de colectiile sortate pentru a ordona "natural" obiectele de acest tip.
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(BasicInterfaceExample o) {
        if (o == null) {
            return 1;
        } else {
            return Integer.valueOf(this.getRang()).compareTo(o.getRang());
        }
    }
}
