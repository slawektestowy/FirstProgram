package co_pętle;

public class petlaWhile {
    public static void main(String[] args){
        int liczenie = 100;
        while (liczenie <=10){                // tu z samym while sie nie wykona bo zmienna jest na wstepie niezgodna
            System.out.println( "tekst " + liczenie);
            liczenie++;

        }

        liczenie =100;
        do {
            System.out.println("tekst " + liczenie + " dodanie while");   // tu sie wykona raz co jest w "do"
            liczenie++;
        } while (liczenie <=10);

    }
}
