class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public void details() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public int speed() {
        return age * 2;
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Woof!");
    }

    @Override
    public void details() {
        super.details();
        System.out.println("This is a dog.");
    }

    @Override
    public int speed() {
        return age * 3;
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Meow!");
    }

    @Override
    public void details() {
        super.details();
        System.out.println("This is a cat.");
    }

    @Override
    public int speed() {
        return age * 4;
    }
}

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Kamen", 5),
                new Cat("Ivo", 3),
                new Dog("Bogdan", 2)
        };

        for (Animal a : animals) {
            a.details();
            a.sound();
            System.out.println("Speed: " + a.speed() + " km/h\n");
        }
    }
}
