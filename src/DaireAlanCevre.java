import java.util.Scanner;

public class DaireAlanCevre {

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        double yaricap,alan,pi=3.14,cevre;

        System.out.println("Yaricap giriniz: ");
        yaricap=oku.nextInt();

        alan=pi*Math.pow(yaricap,2);
        cevre=2*pi*yaricap;

        System.out.println("Ucgenin cevresi = "+cevre+"\nUcgenin alani = "+alan);


    }
}
