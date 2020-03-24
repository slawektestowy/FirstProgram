package co_InstrukcjeWarunkowe;

public class InstrukcjeWarunkowe {
    public static void main(String[] args){

        int wiek =13;
        boolean przyszedlZTata = false;
        boolean przyszedlZMama = true;


        if(wiek >= 18) {
            System.out.println("Warunek zostal spelniony moze kupic");
        }
        else if(przyszedlZTata) {   // to samo co przyszedlZTata == true
            System.out.println("Jest z tata mozesz i tak podac");
        }
        else if(przyszedlZMama && wiek < 18) {     // to samo co przyszedlZMama == true
            System.out.println("OK jest z mama");
        }
        else {
            System.out.println("Nie masz 18 lat");
        }
    }
}
