public class addressbook {
     public static void main(String[] args) {
        // Task 6: Create more objects and test the methods
        Person p1 = new Person("Eda", "17","eda@gmail.com", "123-456-7890");
        p1.print();
        Person p2 = new Person("Hannah", "23","hannah@gmail.com", "404-899-9955");
        p2.print();
        Person p3 = new Person("Maria", "17","maria@gmail.com", "463-453-5432");
        p3.print();


        // Task 8: Test the updateEmail method
        p1.update("gshdf@gmail.com");
        p1.print();
    }
}

// Define the Person class here
class Person {
    // Instance variables
    // Task 1: Add a new attribute (e.g., age)
    private String name;
    private String age;
    private String email;
    private String phoneNumber;

    // Constructor: Initialize Person data
    // Task 3: Assign a default value to the new attribute here.
    public Person(String initName, String initAge, String initEmail, String initPhone) { // Task 2: modify method signature to include your new attribute.
        name = initName;
        age = initAge;
        email = initEmail;
        phoneNumber = initPhone;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println();
        // Task 4: Print the new attribute here
    }

    // Task 5: Add getter methods to access and return each attribute individually. Here's an example:
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Task 7: Add a method to update the email
    public void update(String newEmail){
        email=newEmail;
    }

}
