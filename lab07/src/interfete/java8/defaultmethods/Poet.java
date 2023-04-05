package interfete.java8.defaultmethods;

public interface Poet {
    default void scrie() {
        System.out.println("Scriu versuri!");
    }
}
