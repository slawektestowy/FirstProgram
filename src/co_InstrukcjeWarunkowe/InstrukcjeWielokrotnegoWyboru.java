package co_InstrukcjeWarunkowe;

public class InstrukcjeWielokrotnegoWyboru {
    public static void main(String[] args){
        // switch

        int zmienna =5;
        switch(zmienna) {
            case 1:
                System.out.println("Elegancko");
                break;
            case 2:
                System.out.println("Nie najgorzej");
                break;
            case 3:
                System.out.println("Całkiem dobrze");
                break;
            default:
                System.out.println("Źle, musisz wybrac 1 , 2 lub 3");
        }


    }
}
