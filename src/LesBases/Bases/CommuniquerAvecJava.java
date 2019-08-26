package LesBases.Bases;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CommuniquerAvecJava {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Nom : ");
        String nom = clavier.nextLine();
        System.out.print("Age : ");
        int age = clavier.nextInt();
        clavier.nextLine();
        System.out.print("Adresse : ");
        String adresse = clavier.nextLine();
        System.out.print("Ville : ");
        String ville = clavier.nextLine();
        System.out.print("Pays : ");
        String pays = clavier.nextLine();
        System.out.print("Numéro de téléphone : ");
        String tel = clavier.nextLine();
        System.out.print("Adresse mail : ");
        String mail = clavier.nextLine();
        System.out.println();
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Nom : "+nom);
        System.out.println("Age : "+age);
        System.out.println("Adresse : "+adresse);
        System.out.println("Ville : "+ville);
        System.out.println("Pays : "+pays);
        System.out.println("Numéro de téléphone : "+tel);
        System.out.println("E-mail : "+mail);



    }

}
