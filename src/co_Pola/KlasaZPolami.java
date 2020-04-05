package co_Pola;

public class KlasaZPolami {
    int liczbaCalkowita;

    void zwrocPole(){
        System.out.println("Zwrocona wartosc pola: " + liczbaCalkowita);
    }

    void ustawWartoscPola(int nowaWartosc){
        liczbaCalkowita = nowaWartosc;
    }

    int zwrocWartoscZPola(){
        return liczbaCalkowita;
    }
}
