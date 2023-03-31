package interfete.callback;

/**
 * Verifcam mecanismul de callback
 */
public class TestCallback {
    public static void main(String[] args) {
        // utilizare ca obiect / instanta cu implementarea f(x) = x
        FunctieGenerica fnx =   new TermenGeneral();
        int s1 = Suma.calculeazaSuma(fnx, 10);
        System.out.println("Suma primelor 10 numere naturale: "+s1);

        // Utilizare direct ca obiect instantiat cu new, dar fara referinta
        int s2 = Suma.calculeazaSuma(new TermenGeneralPatrat(), 10);
        System.out.println("Suma patratelor primelor 10 numere naturale: "+s2);

        // Utilizare ca o clasa anonima
        int s3 = Suma.calculeazaSuma(new FunctieGenerica() {
            @Override
            public int functie(int x) {
                return x * x * x;
            }
        }, 10);
        System.out.println("Suma cuburilor primelor 10 numere naturale: " + s3);

        // EXTRA: atunci cand avem o interfata care are O SINGURA METODA, se pot folosi, in loc de clase anonime,
        // lambda expressions
        int s4 = Suma.calculeazaSuma(x -> x * x * x, 10);
        System.out.println("Suma cuburilor primelor 10 numere naturale: " + s4);
    }
}
