public class rpgTasks {

    public static void main(String[] args){
        Wizard wizard = new Wizard("Merlin",100, 10,5);
        Warrior warrior = new Warrior("Ragnar",100,7,10);
        Archer archer = new Archer("Ivo", 100, 6,4);

        System.out.println(wizard.getName() + "'s health: " + wizard.getHealth());
        System.out.println(warrior.getName()+"'s health: " + warrior.getHealth());
        System.out.println(archer.getName()+"'s health: " + archer.getHealth());

        System.out.println("Game is starting...");
        wizard.setHealth(warrior); //warrior attacks wizard
        System.out.println( warrior.getName()+" attacks " + wizard.getName() + ". " + wizard.getName() + " health updated: " + wizard.getHealth());

        // Task 6: make the wizard attack your new character.
        archer.setHealth(wizard); //wizard attacks archer

        // Task 7: display the new stats
        System.out.println( wizard.getName()+" attacks " + archer.getName() + ". " + archer.getName() + " health updated: " + archer.getHealth());

        // CHALLENGE: Update your program for all the characters to be able to attack each other.

    }
}


class Wizard {
    private String name;
    private int health;
    private int darkMagic;
    private int wizardArmor;

    public Wizard(String name, int health, int darkMagic, int wizardArmor){
        this.name = name;
        this.health = health;
        this.darkMagic = darkMagic;
        this.wizardArmor = wizardArmor;
    }

    public String getName() {
        return name;
    }

    public int getDarkMagic(){
        return darkMagic;
    }

    public void setHealth(Warrior attack) {
       health -= (attack.getSword() - wizardArmor);
    }


    public int getHealth() {
        return health;
    }

}

class Warrior {
    private String name;
    private int health;
    private int sword;
    private int metalArmor;

    public Warrior(String name, int health, int sword, int metalArmor){
        this.name = name;
        this.health = health;
        this.sword = sword;
        this.metalArmor = metalArmor;
    }

    public String getName() {
        return name;
    }

    public int getSword() {
        return sword;
    }

    public void setHealth(Wizard attack) {
       health -= (attack.getDarkMagic() - metalArmor);
    }


    public int getHealth() {
            return health;
    }
}

// Task 1: Write another class here for a different type of character (e.g. archer)
class Archer {

    // Task 2: Write instance variables
    private String name;
    private int health;
    private int knife;
    private int archArmor;

    // Task 3: Write the constructor
    public Archer(String name, int health, int knife, int archArmor){
        this.name = name;
        this.health = health;
        this.knife = knife;
        this.archArmor = archArmor;
    }

    // Task 4: Write the necessary getter(accessor) and setter(modifier) methods.
    public String getName() {
        return name;
    }

    public int getKnife() {
        return knife;
    }

    public void setHealth(Wizard attack) {
       health -= (attack.getDarkMagic() - archArmor);
    }
    

    public int getHealth() {
            return health;
    }
}


