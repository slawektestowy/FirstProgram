package co_Stringi;

public class zadania {
    public  static void main(String[] args){
        // Utwórz trzy zmienne typu String. Do pierwszej przypisz swoje imię,
        // do drugiej nazwisko oraz do trzeciej imię i nazwisko oddzielone spacją.
        // Następnie wykonaj polecenia używając odpowiednich metod z String (nie robić nic ręcznie! :) ) i
        // wypisując informacje na ekran:

        String mojeImie = "Jan";
        String mojeNazwisko = "Rambo";
        String imieINazwisko = mojeImie + " " + mojeNazwisko;
        System.out.println(imieINazwisko);
     //   a) wypisz ile znaków zawiera zmienna przechowująca imię, ile nazwisko a ile imię i nazwisko
        System.out.println("Imie zawiera tyle znaków: " + mojeImie.length());
        System.out.println("Nazwisko zawiera tyle znaków: " + mojeNazwisko.length());
        System.out.println("Imie i nazwisko ma tyle znaków: " + imieINazwisko.length());

       // b) sprawdź czy Twoje imię jest równe "Alicja" lub "Jan"
        if(mojeImie.equals("Alicja")){
            System.out.println("Twoje imie to Alicja");
        }
        else if (mojeImie.equals("Jan")){
            System.out.println("Twoje imie to Jan");
        }
        else {
            System.out.println("Nie masz na imie ani Alicja ani Jan, twoje imie to " + mojeImie);
        }

       // c) wypisz nazwisko z WIELKICH LITER
        System.out.println(mojeNazwisko.toUpperCase());

      // d) zamień w nazwisku litery 'a' na 'e' i zobacz czy coś się zmieniło
        System.out.println("To nazwisko przed zmiana litery 'a' na 'e' " + mojeNazwisko);
        System.out.println("To nazwisko bo zmianie tych liter " +mojeNazwisko.replace('a', 'e'));

    // napisz "Witaj swiecie" Kazda litera w osobnej linii
        String zdanie = "Wiaj świecie";

        for(int i = 0; i < zdanie.length(); i++){
            zdanie.charAt(i);
            System.out.println(zdanie.charAt(i));
        }

        // napisz "Witaj swiecie" Kazda litera w osobnej linii teraz od konca:

        System.out.println("##############################");
        for(int i = zdanie.length() -1 ; i >=0; i--){
            zdanie.charAt(i);
            System.out.println(zdanie.charAt(i));
        }


    }
}
