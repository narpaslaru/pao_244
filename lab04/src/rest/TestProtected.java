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
}
