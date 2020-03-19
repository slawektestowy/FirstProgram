package co_PrimitiveTypes;

import org.w3c.dom.ls.LSOutput;

public class primitiveTypes {
    public static void main(String[] args){
        // typy proste
        // liczby calkowite
        byte zmiennaByte =10;  // 1 bajt = 8 bitów = -128 127
        System.out.println("Byte: " + zmiennaByte);
        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        short zmiennaShort = 300;  // 2 bajty = 16 bitów = -32768 32767
        System.out.println("Short: " + zmiennaShort);
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);

        int zmiennaInt = 2000000;

        System.out.println("Integer: " + zmiennaInt); // 4 bajty = 32 bity = -2147483648 2147483647
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

        long zmiennaLong = 100000000000L; // trzeba doda "L" na końcu; 8 bajtów = 64 bity
        System.out.println("Long: " + zmiennaLong);
        System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);

        // Liczby zmiennoprzecinkowe
        float zmiennaFloat = 20.24f;  // 32 bity dokladnosci
        float dokladnyfloat = 20.24123456789f;
        System.out.println("Float: " + zmiennaFloat + " A to dokaładniejszy float: " + dokladnyfloat);

        double zmiennaDouble = 20.24; // 64 bity dokladnosci
        double dokladnyDouble = 20.24123456789;
        System.out.println("Double: " + zmiennaDouble + " A to dokladniejszy double: " + dokladnyDouble);

        //Pojedyncze znakki
        char zmiennaChar = 'a';
        System.out.println("Char: " + zmiennaChar);

        //Wartosci logiczne
        boolean zmiennaBoolean = true;  // lub wartość false
        System.out.println("Boolean: " + zmiennaBoolean);

    }
}
