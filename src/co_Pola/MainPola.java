package co_Pola;

public class MainPola {
    public static void main(String[] args){
        KlasaZPolami obiekt = new KlasaZPolami();
        obiekt.liczbaCalkowita = 14;
        System.out.println(obiekt.liczbaCalkowita);
        obiekt.zwrocPole();

        obiekt.ustawWartoscPola(12);
        obiekt.zwrocPole();

        obiekt.ustawWartoscPola(234);
        int nowka = obiekt.zwrocWartoscZPola();
        System.out.println(nowka);

    }
}
