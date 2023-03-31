package interfete.basic;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * O interfata clasica in Java.
 * Asemenea unei clase, se defineste in propriul ei fisier *.java, preferabil intr-un package
 *
 * Modificator de acces - la fel ca la clase, poate fi:
 *  - public - vizibile de peste tot
 *  - default (nu se specifica) - vizibila doar in package-ul ei
 *
 *  Poate extinde alte interfete - mai jos Serializable
 */
public interface BasicInterfaceExample extends Serializable, Comparable<BasicInterfaceExample> {
    /**
     * MEMBRI
     */
    // poate contine membri de orice tip (primitive, wrappere, clase) care sunt IMPLICIT constante
    // constante => public static final - acesti modificator pot fi mentionati sau omisi
    int NUMBER_ONE = 1;
    public int NUMBER_TWO = 2;
    public static int NUMBER_THREE = 3;
    public static final String PI = "3.1415....";

    // alti modificatori de acces sunt interzisi - codul de mai jos nu se compileaza
//    private String TEST = "three";

    /**
     * METODE - implicit si obligatoriu - public si abstract
     *
     */
    void metodaImplicita(String test);

    /**
     * mentionarea modificatorilor public si abstract in orice combinatie este redundanta
     *
     */
    public String metodaPublica();
    abstract Integer abstractMethod(int i);
    public abstract BigDecimal publicAbstractMethod(double d);

    /**
     * Metoda ce va fi folosita in sortarea obiectelor care vom implementa aceasta interfata
     * @return - returneaza un rang dupa care se va face sortarea - rangul 1 va fi cel mai inalt rang.
     */
    int getRang();
}
