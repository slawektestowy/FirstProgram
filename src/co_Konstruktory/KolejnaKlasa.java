package co_Konstruktory;

public class KolejnaKlasa {
    int a;
    int b;

    KolejnaKlasa(){
      // System.out.println("Konstruktor pusty");

    }

    KolejnaKlasa( int aa, int bb){
     //   System.out.println("Konstruktor z dwoma arugemtanmi,: ");
        a =aa = 100;
        b =bb = 200;

    }

    KolejnaKlasa(int cc){
       //System.out.println("Konstruktor z jedny argumentem gdzie a jest przypisane do argumentuc c");
        a = cc;
        b = 212;

    }
}
