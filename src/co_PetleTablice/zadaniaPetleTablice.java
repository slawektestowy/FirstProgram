package co_PetleTablice;

public class zadaniaPetleTablice {
    public static void main(String[] args) {
        int[] tabliczka = new int[100];
        for (int i = 10; i < tabliczka.length; i++) {
            tabliczka[i] = i;
        }
        for (int i = 10; i < tabliczka.length; i++) {
            System.out.println("tabliczka:" + tabliczka[i] + " " + i);
        }
        zadanie1();
        zadanie2();
    }




    public static void zadanie1() {
        int[] tabix = new int[25];
        for(int i =0; i < tabix.length; i++){
            tabix[i] = i;
        }
        for(int i =0; i< tabix.length; i++){
            System.out.println("Tabix" + tabix[i] + ":" + i);
        }

    }

    public static void zadanie2(){
        int[] zaba = new int[30];
        for(int i = 0; i < zaba.length ; i++){
            zaba[i] = i;
        }
        for(int i =0 ; i< zaba.length; i++){
            System.out.println("Test" + i);

        }

    }
}