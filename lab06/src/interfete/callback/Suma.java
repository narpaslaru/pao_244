package interfete.callback;

/**
 * Clasa utilitara - nu avem nevoie de o instanta ca sa apelam metodele de tip utils. Ex: StringUtils, Collections, Arrays
 */
public class Suma {
    private Suma() {
        // Constructor privat ca sa nu putem instantia aceasta clasa
    }

    /**
     * Calculeaza suma de functie
     *
     * @param fg
     * @param n
     * @return
     */
    public static int calculeazaSuma(FunctieGenerica fg , int n){
        int s = 0;
        for(int i = 1; i <= n; i++)
            s = s + fg.functie(i);
        return s;
    }
}
