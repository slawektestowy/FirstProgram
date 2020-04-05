package co_Konstruktory;

public class MainKonstruktor {
    public static void main(String[] args) {

        KlasaKonstruktora nowkaSztuka = new KlasaKonstruktora(3, 4);

        nowkaSztuka.pole1 = 112;
        nowkaSztuka.pole2 = 1333;


        System.out.println("Pierwsze pole: " + nowkaSztuka.pole1);
        System.out.println("Drugie pole: " + nowkaSztuka.pole2);

        System.out.println("NOWE.......");

        KolejnaKlasa kolejnaKlasaZero = new KolejnaKlasa();
        System.out.println("Tu wyposze sie 0 bo konstruktor jest pusty: " + kolejnaKlasaZero.a);


        KolejnaKlasa kolejnaKlasaJeden = new KolejnaKlasa(21, 33);
        System.out.println("Tu konstruktor z wartosciami dla argumentów, a: " +kolejnaKlasaJeden.a + ", b: " + kolejnaKlasaZero.b);

        KolejnaKlasa kolejnaKlasaDwa = new KolejnaKlasa(33);
        System.out.println("Tutaj cc jest podana, a drugi argument jest w kontruktorze: " + kolejnaKlasaDwa.a + " b: " + kolejnaKlasaDwa.b);


    }


}
