package co_PrimitiveTypes;

public class typyProsteKonwertowanie {
    public static void main(String[] args){
        int a = 6;
        double b = 2.34;
        System.out.println(a / b);

        // konwertowanie niejawne
        byte by = 100;
        int ii = by;
        // byte by1 = ii;  //integer moze byc bajtem, ale bajt nie moze byc integerem

        float flo = 12.22f;
        b = flo;  // dobule konwertuje sie do float bo double ma szerszy zakres
       // flo = b;  --> float nie konwertuje sie do double bo ma wezszy zakres


        // konwertowanie jawne

        int zmienaInt = 3333;
        long zmiennaLong = zmienaInt;

       // int zmiennaInt = zmiennaLong;
        int zmiennaInt = (int) zmiennaLong;

        float zmiennaFloat = 32.12f;
        double zmiennaDouble = zmiennaFloat;
        //float zmiennaFloat2 = zmiennaDouble;
        float zmiennaFloat2 = (float) zmiennaDouble;

        byte bajt = (byte) 1000004;
        System.out.println("Bajt: " + bajt);

        int zmienaObliczenia = 12;
        float zmiennObliczeniaF = 3.22f;
        // wynik zaokroglony (int = int / (int) float)
        int wynikObliczenia = zmienaObliczenia / (int) zmiennObliczeniaF; // wynik int z udzialem int plus float
        System.out.println("Wynik zaokroglony: " + wynikObliczenia);

        float wynikObliczenFloat = zmienaObliczenia / zmiennObliczeniaF;
        System.out.println("Wynik dla float: " + wynikObliczenFloat);

        double wynikaObliczeniaDokladniejszy = zmienaObliczenia / zmiennObliczeniaF;
        System.out.println("Wynik dokladniejszy dla double: " + wynikaObliczeniaDokladniejszy);



    }
}
