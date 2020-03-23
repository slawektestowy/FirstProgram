package co_Tablice;

public class TabliceWielowymiarowe {
    public static void main(String[] args){
        int[][] tablicaDwuwymiarowa = new int[3][3];
        tablicaDwuwymiarowa[0][2] = 13;
        tablicaDwuwymiarowa[2][2] = 15;

        System.out.println(tablicaDwuwymiarowa[0][2]);

        int[][] tablicaDwuwymiarowa2 = { {1,3,4,6}, {4,8,5,10}};  // wiersz sa tutaj 2 a kolumny 4
        System.out.println("tablica dwuwymiarowa [0][3]:" + tablicaDwuwymiarowa2[0][3]); //6
        System.out.println("tablica dwuwymiarowa [1][3]:" + tablicaDwuwymiarowa2[1][3]); // 10
        System.out.println("tablica dwuwymiarowa [1][2]:" + tablicaDwuwymiarowa2[1][2]); // 5

        System.out.println("Tablicadwymiarowa: " +tablicaDwuwymiarowa[0].length);
        System.out.println("Tablicadwuwymairowa2: " + tablicaDwuwymiarowa2[0].length);



    }
}
