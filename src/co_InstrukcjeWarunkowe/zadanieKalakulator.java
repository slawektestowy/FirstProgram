package co_InstrukcjeWarunkowe;
import java.util.Scanner;
import java.util.SortedMap;


public class zadanieKalakulator {
    public static void main(String[] args){
        System.out.print("Podaj imie: ");
        String imie ;
        double a;
        double b;
        char c;
        Scanner odczyt = new Scanner(System.in);
        imie = odczyt.nextLine();

        System.out.println("Witam  w programie KALKULATOR:" + imie);
        System.out.print("Podaj pierwsza liczbe: ");
        a = odczyt.nextDouble();
        System.out.print("Podaj druga liczne: ");
        b = odczyt.nextDouble();
        System.out.println("Podaj jakie działanie ma byc wykonane do wyboru: + - * /");
        c = odczyt.next().charAt(0);
        switch (c) {
            case'+':
                System.out.println("Wybrałes dodawnie i wynik to: " + (a + b));
                break;
            case '-':
                System.out.println("Wybrales odejmowanie i wynik to: " + (a - b));
                break;
            case '*':
                System.out.println("Wybrałeś mnożenie i wynik to: " + (a * b));
                break;
            case'/':
                System.out.println("Wybrałeś dzielenie i wynik to: " + (a/b));
                break;
            default:
                System.out.println("Nie ma takiego działania");

        }




        //        System.out.print("Wynik dodawanie dla tych liczb to: " + (a + b));
    }
}
