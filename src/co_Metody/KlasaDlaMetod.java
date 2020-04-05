package co_Metody;

public class KlasaDlaMetod {

    // typZwracany nazwaMetody(parametry) {
    // }
    void metodaKtoraNicNieZwraca() {    //void slowo kluczowe
        System.out.println("Wartos z metody");
    }

    void metodKtoraPrzyjmujeArgument(int liczba){
        System.out.println("Metoda ktor przyjmie argument: " + liczba);
    }
    void metodaIDwaParametry(int liczba, char znak){
        System.out.println("Liczba: " + liczba);
        System.out.println("Char: " + znak);
    }
    void metodaPrawdaFalsz(boolean takNie, int zmienna) {
        if (takNie == true) {
            System.out.println("Zmienna: " + zmienna);
        } else {
            System.out.println("Jest na FALSE");
        }

    }
    //      Teraz jesli chcemy cos zwrocic w danej metodzie ( a ten zwrot bedzie mogl zostac przypiany do zmiennej w mainie)
//        musimy uzyc czego co != void

    int dodawnie(int a, int b){
        int wynik = a + b;
        return wynik;
        }

    double dubel(double a){
        double wynik = a + 1.5;
        return wynik;
        }

    boolean wortoscLogiczna(boolean wartosc){
        return !wartosc;
        }

    int czyZwrociCos(boolean zwrotka, int a) {
        if (zwrotka) {
            return a;
        } else {
            return 0;
        }
    }


    }





