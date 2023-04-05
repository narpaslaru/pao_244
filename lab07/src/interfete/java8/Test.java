package interfete.java8;

public class Test {
    public static void main(String[] args) {
        InterfataAfisareSir afisareSir = new AfisareSirImpl();
        afisareSir.afiseazaSir("test");
        afisareSir.afiseazaSir("null");
        afisareSir.afiseazaSir(null);

        InterfataAfisareSir afisareSirBad = new AfisareSirBadImpl();
        afisareSirBad.afiseazaSir("test");
        afisareSirBad.afiseazaSir("null");
        afisareSirBad.afiseazaSir(null);

        // metodele statice ale interfetelor se pot apela direct - fara un obiect al unei clase care implementeaza interfata
        InterfataAfisareSir.esteSirVid(null);

        AfisareSirBadImpl.esteSirVid(null);
    }
}
