/*
1. Sprawdź czy wpisana liczba jest parzysta czy nieparzysta. Wypisz odpowiedni komunikat na ekran.
(podpowiedź: jeżeli reszta z dzielenia przez 2 jest równa 0 to znaczy, że liczba jest parzysta).

2. Twoim zadaniem jest obliczenie podatku od dochodu. Obecnie wynosi on 17%. Wiemy,
także doświadczeni programiści potrafią zarabiać pokaźne sumy,
a od pewnego dochodu zwiększony jest podatek do 32%.
Sprawdź ile podatku musiałby zapłacić początkujący programista, zanim przekroczy próg wynoszący 85 528 zł,
a ile już ten doświadczony.

Wzór:
dla dochodu do 85 528 zł podatek wynosi 17%,
dla dochodu powyżej 85 528 zł liczy się go następująco:
- obliczamy podatek 17% z 85 528,
- dodatkowo obliczamy podatek 32% od nadwyżki ponad 85 528 zł,
czyli dochód pomniejszony o 85 528 zł i z tego 32%.
(oczywiście obliczamy orientacyjnie, gdyż nie bierzemy pod uwagę np. ulgi podatkowej).
Uwaga: zrób dodatkowe zabezpieczenie, jeżeli ktoś miałby więcej wydatków niż przychodu, czyli podałby kwotę ujemną dochodu ;)

3. Napisz bardzo prosty kalkulator. Niech potrafi dodawać, odejmować, mnożyć i dzielić.
Co więcej, niech będzie na tyle prostym kalkulatorem, że po podaniu  dwóch liczb, obliczy wynik i zakończy swoje działanie.
Dobrze jakbyś wykorzystał do tego instrukcję "switch" w celu jej przećwiczenia,
chociaż na początek możesz spróbować to zrobić "if'em".
(podpowiedź: będziesz potrzebował co najmniej trzech zmiennych - dwie zmienne do przechowywania
liczb oraz trzecia zmienna jako znak operacji np. '+' dla dodawania)
(podpowiedź 2: znak operacji możesz przechowywać w zmiennej typu char)
 */

package co_InstrukcjeWarunkowe;

public class zadania {
    public static void main(String[] args) {
        System.out.println("Zadania z instrukcji :-)");
        zadanie1(1);
        zadanie2(1);
        zadnie3(1);
    }


    public static void zadanie1(int zmienna) {
        System.out.println("Zadanie 1: ");
        ;
        int liczbaSprawdzana = 5;
        int liczba = liczbaSprawdzana % 2;


        if (liczba == 0) {
            System.out.println("Liczba " + liczbaSprawdzana + " jest liczbą parzystą");
        } else {
            System.out.println("Liczba " + liczbaSprawdzana + " nie jest parzysta");
        }

    }

    public static void zadanie2(int zmienna) {
        System.out.println("Zadanie 2: ");
        //System.out.println("Wynik dla 17% z 1000: " + 222 * 17/100 );
        int poczatkujcy = 5000;
        int doswiadczony = 15000;
        int zarobkiProgramera = -15000;
        int zarobkoProgrameraRoczne = zarobkiProgramera * 12;
        int poczatkujacyRocznie = poczatkujcy * 12;
        int doswiadczonyRocznie = doswiadczony * 12;
        int podatekMaly = 17;
        int podatekDuzy = 32;
        int kwotaMalegoPodatku = poczatkujacyRocznie;
        int kowotaDuezegoPodatku = doswiadczonyRocznie;
        int kwotaOdKtorejPlacimy32 = kowotaDuezegoPodatku - 85528;
        int podatekOdduzejKwoty = kwotaOdKtorejPlacimy32 * podatekDuzy / 100;
        int podatekOdMalejKwoty = kwotaMalegoPodatku * podatekMaly / 100;
//        System.out.println("kwota malego podatku: " + podatekOdMalejKwoty);
//        System.out.println("kwota duzego podatku: " + podatekOdduzejKwoty);
        int podatek17 = zarobkoProgrameraRoczne * podatekMaly / 100;
        int podatek32 = (zarobkoProgrameraRoczne - 85528) * podatekDuzy / 100;
        if (zarobkoProgrameraRoczne <= 85528 && zarobkoProgrameraRoczne > 0){
            System.out.println("Zarabiasz rocznie: " + zarobkoProgrameraRoczne + " a twoj podatek to 17: "+ podatek17 );
          }
        else if (zarobkoProgrameraRoczne < 0){
            System.out.println("Bład Bład....");
        }
        else{
            System.out.println("Zarabiasz rocznie: " + zarobkoProgrameraRoczne + " a twoj podatek to 32: " + podatek32);
        }
        }
    public static void zadnie3(int zmienna){
        System.out.println("lalalala");
        int a = 2;
        int b = 3;
        char znak = '6';

        switch (znak){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a -b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            default:
                System.out.println("Bledny operator");

        }

//        if (znak == '+'){
//            System.out.println(a + b);
//        }
//        else if (znak == '-'){
//            System.out.println(a - b);
//        }
//        else if (znak == '/'){
//            System.out.println(a /b);
//        }
//        else {
//            System.out.println(a *b);
//        }


    }
    }

