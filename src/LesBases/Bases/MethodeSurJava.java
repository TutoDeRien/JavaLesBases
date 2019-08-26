package LesBases.Bases;

public class MethodeSurJava {

    public static void main(String[]args){

        System.out.println("le prix total est de : "+totalTTC(100,21));



    }

    public static float totalTTC(float somme, int pourcentage){

        return somme+(somme*(pourcentage/100));
    }

}
