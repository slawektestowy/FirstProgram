package co_PetleTablice;

public class petlaWPetli {
    public static void main(String[] args){
        int lincznik = 0;
        for(int i =0; i< 5; i++){
            for(int k = 0; k < 20; k++){
                lincznik++;
                System.out.println(lincznik);
            }

        } petlaDwuwymiarowa();
    }

    public static void petlaDwuwymiarowa(){
        int[][] wymiar = new int[4][5];
        int licznik =0;
        for(int i =0; i < 4; i++){
            for(int k= 0; k <5; k++ ){
                licznik ++;
                wymiar[i][k] = licznik;
            }
        }
        for(int i = 0; i <4; i++){
            for(int k = 0; k < 5; k++){
                System.out.print(wymiar[i][k] + " ");
            }
            System.out.println();
        }
    }
}
