package co_PetleTablice;

public class petleTablice {
    public static void main(String[] args){
        int[] tab =new int[10];
        for(int i =0; i < 10; i++){
            tab[i] = i;
        }
        for(int i = 0; i <10; i++){
            System.out.println("tab " + i + ": " + tab[i]);
        }
        //System.out.println("tab:" + tab[i]);
    }
}
