/*
1. Uzupełnij tablicę typu int rozmiaru 5 dowolnymi wartościami.
Następnie zsumuj wszystkie elementy tej tablicy i wynik wypisz na ekran.
Sumowania dokonaj poprzez dodawanie elementów odwołując się do indeksów tablicy.

2. Utwórz tablicę dwuwymiarową typu double wymiaru 3x5 i także wypełnij dowolnymi wartościami.
Tym razem zsumuj elementy z każdego wiersza osobno i wypisz wynik na ekran.

 */
package co_Tablice;



public class zadanie {
    public static void main(String[] args) {
        System.out.println("blevle");
        zadanie1(1);
        zadanie2(1);


    }

    public static void zadanie1(int zmienna){
        System.out.println("Zadanie 1:");
        int[] tablicaRozmiaru5 = new int[5];
        tablicaRozmiaru5[0]=11;
        tablicaRozmiaru5[1]=3;
        tablicaRozmiaru5[2]=13;
        tablicaRozmiaru5[3]=14;
        tablicaRozmiaru5[4]=19;
        System.out.println(tablicaRozmiaru5[0] + tablicaRozmiaru5[1] + tablicaRozmiaru5[2]);


    }
    public static void zadanie2(int zmienna){
        System.out.println("Zadanie 2:");
       /*i rozpisywanie wartosci dla kazdej kolumny z wirsza double[][] tablicaDwuWymiar3na5 = new int[3][5];
       tablicaDwuWymiar3na5[0][0]= 10;
       tablicaDwuWymiar3na5[0][1]= 12;
        tablicaDwuWymiar3na5[0][2]= 100;
        tablicaDwuWymiar3na5[0][3]= 133;
        ...
        ...
        */
        double[][] tablicaDwuWymiar3na5 = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
        double pierwszyWiersz = tablicaDwuWymiar3na5[0][0]
               + tablicaDwuWymiar3na5[0][1] + tablicaDwuWymiar3na5[0][2]
                + tablicaDwuWymiar3na5[0][3] +tablicaDwuWymiar3na5[0][4];
        System.out.println("Suma pierwszego wiersza: " + pierwszyWiersz);

       // System.out.println("wartosc: " + tablicaDwuWymiar3na5[0]);

    }
}
