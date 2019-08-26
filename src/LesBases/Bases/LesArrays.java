    package LesBases.Bases;

    import java.util.Arrays;

    public class LesArrays {

        public static void main(String[] args) {

            int [][]nombre = new int [10][10];
            int count=0;
            for (int x = 0;x<nombre.length;x++){

                System.out.print("Ligne "+(x+1)+" : ");

                for (int i = 0;i<nombre[x].length;i++){
                    nombre[x][i]=count++;
                    System.out.print("["+nombre[x][i]+"]");
                }
                System.out.println();
            }

        }

    }
