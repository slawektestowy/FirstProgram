package co_Tablice;

public class TabliceJednowymiarowe {
    public static void main(String[] args){
        //arrays

        int[] tabliczka;
        tabliczka = new int[12];
        // tabliczka[indeks]
        tabliczka[0] = 10;
        tabliczka[3] = 120;

        System.out.println(tabliczka[3]);
        System.out.println(tabliczka[0]);
        System.out.println(tabliczka[10]);
       // System.out.println(tabliczka[12]);   12 juz byc nie moze elemnty od 0 do 11

        double[] tablicaDouble = new double[7];
        tablicaDouble[0]= 2.0;
        tablicaDouble[2]= 3.5;
        System.out.println(tablicaDouble[0]);
        System.out.println(tablicaDouble[2]);
        System.out.println(tablicaDouble[5]);
       // System.out.println(tablicaDouble[7]); 7 juz byc nie moze, elementy od 0 do 6

        //int[] nowaTablicaIntow = new int[] {20, 12, 11, 40}; lub:
        int[] nowaTablicaIntow = {20, 12, 11, 40};

        System.out.println(nowaTablicaIntow[0]);
        System.out.println(nowaTablicaIntow[1]);
        System.out.println(nowaTablicaIntow[2]);

        System.out.println("NowaTablicaIntow ma rozmiar: " +nowaTablicaIntow.length);
        System.out.println("Tablica double ma rozmiar: " +tablicaDouble.length);
        System.out.println("Tablica intow ma rozmiar: " +tabliczka.length);


    }
}
