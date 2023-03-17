package rest;

import test.ModificatoriAcces;

public class TestProtected extends ModificatoriAcces{
    public static void main(String[] args) {
        ModificatoriAcces modificatoriAcces = new ModificatoriAcces();

        modificatoriAcces.stringPublic();

        TestProtected testProtected = new TestProtected();
        testProtected.stringProtected();
        testProtected.stringPublic();
    }

    /**
     * Descrii metoda, comportament
     * @return
     */
    @Override
    @Deprecated
    public String stringPublic () {
        return "publicOverridden";
    }


    public String stringPublic(String test) {
        return stringPublic() + test;
    }

    public String stringPublic(String test, String test2) {
        return stringPublic(test) + test2;
    }
}
