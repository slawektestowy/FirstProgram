package co_logicalOperatros;

public class OperatoryLogiczne {
    public static void main(String[] args){
        int wiek = 20;

        // koniunkcja (AND)
        System.out.println(wiek >= 19 && wiek <= 21);
        System.out.println(wiek > 15 && wiek < 20);

        //alternatywa (OR)
        System.out.println(wiek > 20 || wiek < 19);
        System.out.println(wiek > 30 || wiek <= 20);
        System.out.println(wiek >= 20 || wiek < 5);

        //negacja
        boolean prawda = true;
        System.out.println("!Prawda: " + !prawda);

        boolean falsz = false;
        System.out.println("!Falsz: " + !falsz);


    }
}
