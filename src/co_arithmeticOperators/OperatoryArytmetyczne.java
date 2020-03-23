package co_arithmeticOperators;

public class OperatoryArytmetyczne {
    public static void main(String[] args){
        // arithmetic operators
        System.out.println(3*2);
        System.out.println(3-4);
        System.out.println(3+3);
        System.out.println(11 % 3);
        System.out.println(12/(2*2));

        int a = 6;
        int b = 4;

        int dodawanie = a + b;
        int odejmowanie = a - b;
        System.out.println("Wynik dodadawania to: " + dodawanie + " a wynik odejmowania to: " + odejmowanie);

       // a = a + b;
        a += b;
        System.out.println("a = a + b = " + a);
        a -= b;
        System.out.println("a -= b: = " + a + " to inaczej a = a - b");
        a %= b;
        System.out.println("a %= b: " + a + " to inaczej a = a % b");
        System.out.println(" a jest w tym momencie równa: " + a);

        //inkrementacja
        System.out.println("inkrementacja:");
        a++;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);

        //dekremantacja
        System.out.println("dekrementacja:");
        a--;
        System.out.println("a = " + a);
        a--;
        System.out.println("a = " + a);



    }
}
