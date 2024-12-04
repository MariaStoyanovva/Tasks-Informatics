public class zooTask{
    public static void main(String[] args){
        Habitat h1 = new Habitat("Savannah", 100, 25);
        Habitat h2 = new Habitat("Rainforest", 200, 21);

        Staff s1 = new Staff("Ivo", "Zookeeper");
        Staff s2 = new Staff("Ani", "Specialist");

        Zoo zoo = new Zoo();

        zoo.AddAnimal1(h1); //association
        zoo.AddAnimal2(h2); //association
        zoo.AddAnimal3(h1); //association
        zoo.AddAnimal4(h2); //association

        s1.assignStaff(h1);
        System.out.println(s1.getName() + " is assigned to " + h1.getType());
        s2.assignStaff(h2);
        System.out.println(s2.getName() + " is assigned to " + h2.getType());

        zoo.feedAnimal1(s1);

    }
}

class Animal{
    private String name;
    private String species;
    private int age;
    Habitat habitat;

    public Animal(String name, String species, int age, Habitat habitat){
        this.name=name;
        this.species=species;
        this.age=age;

    }

    public String getName() {
        return name;
    }
}

class Habitat{
    private String type;
    private int size;
    private int temperature;

    public Habitat(String type, int size, int temperature){
        this.type=type;
        this.size=size;
        this.temperature=temperature;
    }

    public String getType() {
        return type;
    }
}

class Zoo{
    private Animal a1;
    private Animal a2;
    private Animal a3;
    private Animal a4;

    void AddAnimal1(Habitat habitat){
        a1 = new Animal("kamen","snake", 2, habitat); //composition
    }
    void AddAnimal2(Habitat habitat){
        a2 = new Animal("bogdan","monkey", 1, habitat); //composition
    }
    void AddAnimal3(Habitat habitat){
        a3 = new Animal("viktor","octopus", 3, habitat); //composition
    }
    void AddAnimal4(Habitat habitat){
        a4 = new Animal("dara","cow", 5, habitat); //composition
    }

    void feedAnimal1 (Staff staff){
        System.out.println(a1.getName() + " is fed by " + staff.getName());
    }

}

class Staff{
    private String name;
    private String role;
    private Habitat assignedHabitat;

    public Staff(String name, String role){
        this.name=name;
        this.role=role;
    }


    public void assignStaff(Habitat habitat){
        this.assignedHabitat=habitat;
    }

    public String getName() {
        return name;
    }
}
