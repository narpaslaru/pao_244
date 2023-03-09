import model.Categorie;
import model.Produs;
import model.Serviciu;

public class Main {
    public static void main(String[] args) {
        Produs produs = new Produs(10, "TV Samsung",
                new Categorie(5, "Electronice", null));
        System.out.println("Produs: "+produs);

        Produs produs2 =  new Produs(10, "TV Samsung",
                new Categorie(5, "Electronice", null));;

        System.out.println("Sunt egale? :" + (produs2.equals(produs)));

        int i = 5;
        i++;

        System.out.println("i = "+i);

        System.out.println("char" + 'a');
        System.out.println("~bool" + ~'a');
        Serviciu serviciu = new Serviciu(5, "Instalare TV",
                new Categorie(20, "Servicii", null),
                1234567L);
    }
}