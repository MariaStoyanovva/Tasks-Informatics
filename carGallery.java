import java.util.Scanner;
public class carGallery {
    public static void main(String[] args) {

        Car[] carArray = {
                new Car("Toyota", "Camry", 2020, 20000, false),
                new Car("Honda", "Civic", 2021, 15000, false),
                new Car("Ford", "Fusion", 2019, 17000.32, false),
                new Car("Hyundai", "Tucson", 2022, 18233.5, false),
        };

        displayAll(carArray);
        System.out.println();
        findMostExpensive(carArray);
        System.out.println();
        calculateAveragePrice(carArray);
        System.out.println();
        leasing(carArray);
        System.out.println();
        displayAll(carArray);
    }

    private static void calculateAveragePrice(Car[] cars) {
        double sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }

        System.out.println("Average price of all cars:");
        System.out.println((double) sum / cars.length);
    }

    private static void findMostExpensive(Car[] cars){
        double mostExpensive=cars[0].getPrice();
        int indexOfMostExpensive=0;
        for(int i=0;i<cars.length;i++){
            if(cars[i].getPrice()>mostExpensive){
                mostExpensive=cars[i].getPrice();
                indexOfMostExpensive=i;
            }
        }

        System.out.println("Most expensive car:");
        cars[indexOfMostExpensive].displayInfo();
    }

    private static void leasing(Car[] cars){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Which car do you want to lease? Enter it's brand");

        String entered = scanner.nextLine();
        for(int i=0;i<cars.length;i++){
            if(entered.equalsIgnoreCase(cars[i].getMake())){
                cars[i].isLeased=true;
            }
        }
    }

    private static void displayAll(Car[] cars){
        System.out.println("All cars:");
        for(Car elements: cars){
            elements.displayInfo();
        }
    }

}

class Car {
    String make;
    String model;
    int year;
    double price;
    boolean isLeased;

    public Car(String make, String model, int year, double price, boolean isLeased) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price=price;
        this.isLeased=isLeased;
    }

    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public void displayInfo() {
        System.out.print(make + " " + model + " (" + year + ") - " + price + " - ");
        if(isLeased) System.out.println("leased");
        else System.out.println("not leased");
    }
}
