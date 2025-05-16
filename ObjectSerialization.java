import java.io.*;

public class ObjectSerialization {
    public static void main(String[] args) {
        Student stu = new Student(1, "Mimi");

        stu.writeToFile("records.txt"); //needs to be an existing file
        stu.readFromFile("records.txt");
    }
}

class Student{
    private int studentID;
    private String name;

    public Student(int studentId, String name){
        this.studentID=studentId;
        this.name=name;
    }

    public void writeToFile(String path){
        try(ObjectOutputStream print = new ObjectOutputStream(new FileOutputStream(path))){
            print.writeObject(this);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void readFromFile(String path){
        try(ObjectInputStream read = new ObjectInputStream(new FileInputStream(path))){
            try{
                while(true){
                    Student stu1 = (Student) read.readObject(); //casting
                    System.out.println("id: " + stu1.studentID + "name: " + stu1.name);
                }
            }catch(EOFException e){};
        }catch(IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
