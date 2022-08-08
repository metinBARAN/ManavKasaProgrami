import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double armut = 2.14,elma,domates,muz,patlican;


        Scanner log=new Scanner(System.in);
        System.out.println("Armut kac kilo: ");
        armut=log.nextDouble();

        System.out.println("Elma kac kilo: ");
        elma=log.nextDouble();

        System.out.println("Domates kac kilo: ");
        domates=log.nextDouble();

        System.out.println("Muz kac kilo: ");
        muz=log.nextDouble();

        System.out.println("Patlican kac kilo: ");
        patlican=log.nextDouble();



         double tutar=((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5));
        System.out.println("Toplam tutar: "+tutar);
    }
}
