package LesBases.overloading;

public class Personne {

    private String name;
    private int age;

    public Personne(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person Created");
    }

    public Personne(String name){
        this(name,0);
    }

    public Personne(int age){
        this(null,age);
    }

    public Personne(){
        this(null,0);
    }


}
