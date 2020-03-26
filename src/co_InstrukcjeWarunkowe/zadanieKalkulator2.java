package co_InstrukcjeWarunkowe;
import java.util.Scanner;


public class zadanieKalkulator2 {
    public static void main(String[] args){
        System.out.println("Witaj w programie kalkulator :-)");
        Scanner odczyt = new Scanner(System.in);
        String imie;
        double a;
        double b;
        char znak;
        System.out.print("Podaj swoje imie: ");
        imie = odczyt.nextLine();
        System.out.println("Witaj w progamie kalkultor " + imie);
        System.out.print("Podaj pierwsza liczbe: ");
        a = odczyt.nextDouble();
        System.out.print("Podaj druga liczbę: ");
        b =odczyt.nextDouble();
        System.out.println("Wybierz rodzaj dzialania ktore ma zostac wykonane");
        System.out.println("Do wyboru jest: '+' '-' '/' '*'");
        znak = odczyt.next().charAt(0);
        if (znak == '+'){
            System.out.println("Wybrano dodawnie, twoj wynik to: " + (a + b));
        }
        else if (znak == '-'){
            System.out.println("Wybrano odejmowanie, twoj wynik to: " + (a - b));
        }
        else if (znak == '/'){
            System.out.println("Wybranno dzielnie, twoj wynik to: " + (a / b));
        }
        else if (znak == '*'){
            System.out.println("Wybrano mnożenie, twoj wynik to: " + (a * b));
        }
        else{
            System.out.println("Wybrano zły operator");
        }

    }
}
