package interfete.java8;

// incepand cu Java 8 si Java 9, interfetele au primit metode default, private si statice
public interface InterfataAfisareSir {
    /**
     * Metoda default - cu implementare - ca in clasele abstracte
     * @param sir
     */
    default void afiseazaSir(String sir) {
        if (!esteSirVid(sir)) {
            System.out.println("Sirul: "+sir);
        } else {
            System.out.println("Sirul este vid");
        }
    }

    /**
     * Metoda statica - ele trebuie sa aiba o implementare
     *
     * @param sir
     * @return
     */
    static boolean esteSirVid(String sir) {
        System.out.println("Metoda esteSirVid din interfata");
        return sir == null ? true : (sir.equals("") ? true : false);
    }

}
