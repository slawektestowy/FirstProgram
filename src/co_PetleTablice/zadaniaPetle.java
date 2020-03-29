/*
9 zadań
1. Wypisz na ekran liczby od 0 do 30, a następnie od 30 do 0.

2. Napisz program, które wypisze tylko liczby parzyste z zakresu od 0 do 30.

3. Podaj dwie dowolne liczby a i b, gdzie a jest mniejsze od b (a < b). Wypisz na ekran zakres liczb od a do b.

4. Utwórz tablicę rozmiaru 10 elementów i uzupełnij liczbami. Wypisz wszystkie liczby z tej tablicy na ekran.
Następnie wypisz wszystkie liczby od tyłu.

5. Wykorzystując tablicę z poprzedniego zadania, oblicz sumę wszystkich jej elementów.

6. Napisz program, który będzie obliczał silnię z nieujemnej liczby tj. jeżeli podamy liczbę 5,
to zostanie obliczona 5! (wykrzyknik to znak silni). Obliczamy to w następujący sposób:
5! = 5 * 4 * 3 * 2 * 1 = 120.
Uważaj, bo silnia kolejnych liczb bardzo szybko rośnie i łatwo wyjść poza rozmiar typu int.

7. Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki)
trójkąt prostokątny o przyprostokątnych składających się z n-razy * ;)
np. podając n = 5 powinniśmy otrzymać taki trójkąt:
 *
 **
* **
** **
*****

8*. Narysuj odbicie lustrzane trójkąta z poprzedniego zadania tj. dla n = 5 powinniśmy ujrzeć:

        *
       **
     ***
   ****
 *****

9**. (do samodzielnego rozwiązania) Napisz program, w którym po podaniu liczby n narysujesz za pomocą * drzewko choinkowe o wysokości n
 np. podając n = 5 powinniśmy otrzymać takie drzewko: 
      *
     **
    ***
   ****
  *****
 */

package co_PetleTablice;

public class zadaniaPetle {
    public static void main(String[] args){
        System.out.println("Test");
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie4jeden();
        zadanie6();

    }

    public static void zadanie1(){
        System.out.println("Zadanie1");
        int zmienna =0;
        int zmienna2 =30;
        while(zmienna <=30){
            System.out.println(zmienna);
            zmienna++;
        }
        System.out.println("DDDDDD");
        while(zmienna2 >=0){
            System.out.println(zmienna2);
            zmienna2--;
        }

    }

    public static void zadanie2(){
        System.out.println("Zadanie 2");
        for(int i = 0 ; i <= 30; i+=2){
            System.out.println("Taka 30: " + i);
        }

    }

    public static void zadanie3(){
        System.out.println("Zadanie 3");
        int a =4;
        int b =8;
        for(int i = a; i <= b; i++){
            System.out.println(i);
        }


    }
    public static void zadanie4(){
        System.out.println("Zadanie4");
        int [] tab ={23, 45,34,56,45,67,89,7,8,65};
        for(int i =0; i < tab.length; i++){
            System.out.println("Taaaaaaa " + tab[i]);

        }
        for(int i =9; i >=0; i--){
            System.out.println("Blalalalala: " + tab[i]);
        }
        System.out.println("Obliczenie");
        int bbb = 0;
        for(int i : tab){
            bbb +=i;
        }
        System.out.println("Suma: " + bbb);
        System.out.println("Oblicznie przez petle for");
        int ccc =0;
        for(int i = 0; i < tab.length; i++){
            ccc = tab[i] + ccc;
        }
        System.out.println("Suma petla FOR: " + ccc);

    }

    public static void zadanie4jeden(){
        System.out.println("zadanie4jeden");
        int[] tabliczka = {12, 34, 21,33,23,111,44, 23, 33};
        int sumka =0;
        for(int i =0; i < tabliczka.length; i++){
            sumka = tabliczka[i] + sumka;

        }
        System.out.println("Sumka: " + sumka);

        int[] tabex = {1, 55, 55,111};
        int sumix = 0;
        for(int i = 0; i < tabex.length; i++){
            sumix += tabex[i];
        }
        System.out.println("Sumka 2: " + sumix);

    }

    public static void zadanie6(){
        System.out.println("Zadanie z silnia :-)");
        // 5! = 5 * 4 * 3 * 2 * 1   = 120
        int silnia5 =5;
        int zmienna = 1;
        for(int i = silnia5; i >= 1; i--){
            zmienna = i * zmienna ;

        }
        System.out.println("To jest wynik: " + zmienna);
    }





}











