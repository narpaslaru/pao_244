package interfete.callback;

/**
 * Implementeaza functia f(x) = x^2;
 */
public class TermenGeneralPatrat implements FunctieGenerica{
    @Override
    public int functie(int x) {
        return x * x;
    }
}
