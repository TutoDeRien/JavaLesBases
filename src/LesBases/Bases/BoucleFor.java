package LesBases.Bases;

public class BoucleFor {

    public static void main(String[] args) {

        for (int nombre = 2;nombre<100;nombre++){
            boolean test = true;

            for (int start = 2;start<nombre;start++){
                if (nombre%start==0){
                    test = false;
                    break;
                }
            }
            if (test) {
                System.out.println(nombre);
            }
        }

    }


}
