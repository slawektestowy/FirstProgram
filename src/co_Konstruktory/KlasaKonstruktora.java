package co_Konstruktory;

public class KlasaKonstruktora {
    int pole1 ;
    int pole2 ;

    KlasaKonstruktora(){

    }


    KlasaKonstruktora(int wartoscX){
        System.out.println("jestem w konstruktorze z jedna wartoscia");
        pole1 = wartoscX;
        //pole2 = 1000;
    }

    KlasaKonstruktora( int wartosc1, int wartosc2){
        System.out.println("jestem w konstruktorze z dwiema wartosciami");
        pole1 = wartosc1;
        pole2 = wartosc2;

    }

}
