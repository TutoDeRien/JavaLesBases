package LesBases.Bases;

import java.util.Scanner;

public class LesSwitchSurJava {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Nombre 1 :");
        int nombre1 = clavier.nextInt();

        System.out.print("Nombre 2:");
        int nombre2 = clavier.nextInt();

        System.out.println();
        System.out.println("----------------");
        System.out.println();
        System.out.println("Que voulez vous faire avec le nombre "+nombre1+" et le nombre "+nombre2+" ?");
        System.out.println();
        System.out.println("1 pour +");
        System.out.println("2 pour -");
        System.out.println("3 pour *");
        System.out.println("4 pour /");
        System.out.println();

        System.out.print("faite votre choix :");
        int choix = clavier.nextInt();
        System.out.println();

        switch (choix){
            case 1 :
                System.out.println(nombre1+nombre2);
                break;
            case 2 :
                System.out.println(nombre1-nombre2);
                break;
            case 3 :
                System.out.println(nombre1*nombre2);
                break;
            case 4 :
                if (nombre2!=0) {
                    if (nombre1%nombre2 > 0) {
                        System.out.println((float) nombre1 / (float) nombre2);
                    } else {
                        System.out.println(nombre1 / nombre2);
                    }
                }else {
                    System.out.println("Nous ne pouvons pas diviser par zéro");
                }
                break;
                default:
                    System.out.println("! Erreur");
        }
    }
}
