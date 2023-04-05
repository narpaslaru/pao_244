package interfete.java17.sealedclasses;

public sealed class Angajat extends Persoana implements Cloneable permits Economist, Inginer, Paznic {
}
