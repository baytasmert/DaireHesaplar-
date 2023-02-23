import java.util.Scanner;

public class DaireAlanCap {
    public static void main(String[] args) {

        double pi=3.14,yaricap,merkezaci,alan;
        Scanner oku=new Scanner(System.in);

        System.out.println("Dairenin yaricapini giriniz: ");
        yaricap=oku.nextInt();

        System.out.println("Dairenin merkez acı olcusunu giriniz: ");
        merkezaci=oku.nextInt();

        alan= (pi*Math.pow(yaricap,2)*merkezaci)/360;

        System.out.println("Dairenin alani = "+alan);








    }
}