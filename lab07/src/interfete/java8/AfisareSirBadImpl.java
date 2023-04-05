package interfete.java8;

public class AfisareSirBadImpl implements InterfataAfisareSir {
    // o implementare problematica - nu este mostenita din interfata
    public static boolean esteSirVid(String sir) {
        System.out.println("Metoda esteSirVid din clasa!");
        return sir.length() == 0;
    }

}
