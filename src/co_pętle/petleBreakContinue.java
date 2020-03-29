package co_pętle;

public class petleBreakContinue {
    public static void main(String[] arg) {
        for (int zmienna = 1; zmienna <= 20; zmienna++) {
            //System.out.println("Przed continue " );
            if (zmienna == 17) {
                continue;
            }
            System.out.println("Zmienna: " + zmienna);
        }

        for (int zmienna = 1; zmienna <= 20; zmienna++) {
            if (zmienna == 17) {
                break;
            }
            System.out.println("Zmienna 2: " + zmienna);
        }

        for(int zmienna =1;  ; zmienna++){
            if(zmienna == 50){
                break;
            }
            System.out.println("trzeci for: " + zmienna);
        }
    }


}
