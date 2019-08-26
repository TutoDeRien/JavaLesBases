package LesBases.heritage;

public class HeritageMain {
    public static void main(String[] args) {

        Electro machine= new Electro("Miel",200,299,2);
        System.out.println(machine.getSellPrice());
        machine.setSellPrice(350);
        System.out.println(machine.getSellPrice());
    }
}
