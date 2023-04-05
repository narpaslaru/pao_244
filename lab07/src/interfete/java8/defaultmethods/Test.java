package interfete.java8.defaultmethods;

public class Test {
    public static void main(String[] args) {
        Scriitor scriitor = new Scriitor();
        scriitor.scrie();

        Poet poet = new Scriitor();
        poet.scrie();

        Prozator prozator = new Scriitor();
        prozator.scrie();

        // anonymous class - like implementing an interface
        Poet poet1 = new Poet() {};
        poet1.scrie();
    }
}
