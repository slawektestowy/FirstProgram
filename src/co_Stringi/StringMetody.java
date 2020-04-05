package co_Stringi;

public class StringMetody {
    public static void main(String[] args){
        String jakisTekst = ("Dzien dobry");
        System.out.println("Length: " + jakisTekst.length());
        System.out.println(jakisTekst.isEmpty());
        System.out.println("Jaki znak jest w stringu pod danym indeksem: "+ jakisTekst.charAt(4));
        System.out.println(jakisTekst.charAt(jakisTekst.length() -1));
        System.out.println(jakisTekst.charAt(jakisTekst.length() -2));
        System.out.println(jakisTekst.substring(7));
        System.out.println(jakisTekst.substring(1,5));

        String nowyString = (" sdsdsd sdsdd  sdsds    ");
        System.out.println("." + nowyString + ".");
        System.out.println("Trim: " + "." + nowyString.trim() + ".");
        System.out.println("Tylko małe litery " +nowyString.toLowerCase());
        System.out.println("Tylko duze litery: " + nowyString.toUpperCase());
        System.out.println("Czy zawiera: " + nowyString.startsWith(" sds"));

        // male zadanie:
        System.out.println("ZADANIE");

        String zadanieStringowe = "  Dzien dobry to jest teskt ";
        System.out.println(zadanieStringowe.startsWith("dzien"));
        zadanieStringowe = zadanieStringowe.toLowerCase();
        zadanieStringowe = zadanieStringowe.trim();
        System.out.println("Dokonano modyfikacji w kilku linijkach: " + zadanieStringowe.startsWith("dzien"));

        String olaOla = " Witaj Swiecie  ";
        System.out.println(olaOla.startsWith("witaj"));
        olaOla = olaOla.toLowerCase().trim();
        System.out.println("W jednej linijce: " + olaOla.startsWith("wi"));

        System.out.println(olaOla);
        String jedenWyraz = "Zaaaaaaaazraz ";
        System.out.println(jedenWyraz.contains("a"));





    }

}
