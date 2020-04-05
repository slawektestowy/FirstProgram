package co_Metody;

public class Metody {
    public static void main(String[] args){
   //     KlasaDlaMetod.     ---> nic nie zwraca po kropce, trzeba utworzyc byt w pamieci

        KlasaDlaMetod nazwaMetodki = new KlasaDlaMetod(); // utworzona byt w pamieci dla KlasaDlametod jako nazwaMetodki
        nazwaMetodki.metodaKtoraNicNieZwraca();
        nazwaMetodki.metodKtoraPrzyjmujeArgument(22);
        nazwaMetodki.metodaIDwaParametry(11, '+');
        nazwaMetodki.metodaPrawdaFalsz(false, 33);
        int lala = nazwaMetodki.dodawnie(3, 6);
        System.out.println(lala);

        double bombastik = nazwaMetodki.dubel(1.5);
        System.out.println(bombastik);

        System.out.println(nazwaMetodki.wortoscLogiczna(true));

        System.out.println(nazwaMetodki.czyZwrociCos(true, 10));




    }
}
