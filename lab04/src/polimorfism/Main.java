package polimorfism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Card card = new Card();
        Posedat posedat = card;
        Entity entity = card;

        Card card1 = (Card) entity;

        System.out.println(entity.getId());

        List<Entity> listaEntitati = new ArrayList<>();
        listaEntitati.add(new Entity());
        listaEntitati.add(new Card());
        listaEntitati.add(new Cont());

        for (Entity e : listaEntitati) {
            System.out.println(e.getId());
        }
    }
}
