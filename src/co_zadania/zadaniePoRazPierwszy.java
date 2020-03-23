package co_zadania;

/*
6 zadań

1. Utwórz program, w którym stworzysz zmienne i przypiszesz do tych zmiennych wartości takie jak Twój wiek, wzrost, waga.
Niech będą w jednostkach lata, metry, kilogramy odpowiednio. Będziesz potrzebował 3 zmienne.
Zastanów się nad nazewnictwem oraz typem zmiennych. Na koniec wypisz wszystko na ekran.

2. Na podstawie danych z poprzedniego zadania oblicz Twoje BMI (Body Mass Index).
Wzór to masa / wzrost^2 (masa w kilogramach, wzrost w metrach).

3. Skonwertuj wynik z poprzedniego zdania na liczbę całkowitą.
Zadanie jest szybkie, ale podpowiem Ci, że chcemy skonwertować liczbę zmiennoprzecinkową
(np. float) na liczbę całkowitą (np. int).

4. Podaj dowolną liczbę typu całkowitego. Następnie oblicz wynik dzielenia oraz resztę z dzielenia przez liczby 2, 3 oraz 11.
Zobacz czy wyniki zgadzają się z Twoimi oczekiwaniami.

5. Odpowiedź, co ujrzymy na ekranie dla poniższego kodu?

int x = 5;
boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
boolean wynikDrugi =  x < 10 && x != 0 && x > -1;
System.out.println("Wynik pierwszy: " + wynikPierwszy);
System.out.println("Wynik drugi: " + wynikDrugi);
6*. Przypisz wartość przekraczającą poza rozmiar zmiennej typu int.
Zobacz co się stanie i zastanów dlaczego. Spróbuj oszukać środowisko, aby nie wytykało Ci błędów :)
 */

public class zadaniePoRazPierwszy {
    static int wiek = 30;
    static int waga = 95;
    static double wzrost = 1.78;
    public static void main(String[] args){
        System.out.println("test" + (1+1));
        zadanie(1);
        zadanie2(1);
        zadanie4(1);




    }
    public static void zadanie(int zmienna){
        System.out.println("Zadanie 1: ");
        int wiek =30;
        int waga = 95;
        double wzrost = 1.78;
        System.out.println("Moj wiek to: " + wiek + ", waga " + waga + "kg" + ", a wzrost to " + wzrost +"m");

    }


    public static void zadanie2(int zmienna){
        System.out.println("Zadanie 2:" );
        double bmi = waga / (wzrost * wzrost); // Math.pow(wzrost, 2)
        bmi *= 100;
        bmi = Math.round(bmi);
        bmi /= 100;
        System.out.println("Moje BMI wynosi: " + bmi);

//        float a =3;
//        float b = 3;
//        System.out.println(Math.pow(a,b));
    }

    public static void zadanie4(int zmienna){
        int dowolnaLiczbaCalkowita = 120;
        System.out.println("Dzielenie przez 2: " + dowolnaLiczbaCalkowita /2 );
        System.out.println("Dzielenie przez 3: " + dowolnaLiczbaCalkowita / 3);
        System.out.println("Reszta z dzielenia przez 11: " + dowolnaLiczbaCalkowita % 11);
        int x = 5;
        boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
        boolean wynikDrugi =  x < 10 && x != 0 && x > -1;
        System.out.println("Wynik pierwszy: " + wynikPierwszy);
        System.out.println("Wynik drugi: " + wynikDrugi);


    }
}


