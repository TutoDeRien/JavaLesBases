package LesBases.Bases;

import java.util.Scanner;

public class ConditionIFDansJava {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Quelle est votre age ? :");
        int age = clavier.nextInt();

        int annee = 2019 - age;

        if(annee >=1995){
            System.out.println("Géneration Z");
        }else if(annee <1995 &&annee >=1978){
            System.out.println("Genération y");
        }else if(annee <1978 && annee>=1960){
            System.out.println("Genération x");
        }else if(annee <1960 && annee>=1943){
            System.out.println("Baby boomer");
        }else if(annee <1960 && annee>=1943){
            System.out.println("Genération silencieuse");
        }else{
            System.out.println("wow tu es un dinosaure !");
        }
        System.out.println("--------");
        System.out.println();
        System.out.println("> ou égal à 1995 ==> Génération Z\n" +
                "entre 1978 et 1994 ==> Génération Y\n" +
                "entre 1960 et 1977 ==> Génération X\n" +
                "entre 1943 et 1959 ==> Baby boomer\n" +
                "entre 1925 et 1942 ==> génération silencieuse\n" +
                "sinon ==> wow tu es un dinosaure ! \n");



    }
}
