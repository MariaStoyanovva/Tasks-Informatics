import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter outStream = null;

        try {

            System.out.print("Enter the name of the file to save the grocery list: ");
            String fileName = scanner.nextLine();

            outStream = new PrintWriter(new FileOutputStream(fileName));

            System.out.println("Enter grocery items (type 'done' to finish):");
            while (true) {
                String item = scanner.nextLine();
                if (item.equalsIgnoreCase("done")) {
                    break;
                }
                outStream.println(item);
            }

            System.out.println("Grocery list saved to " + fileName);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();

        } finally {
            if (outStream != null) {
                outStream.close();
            }
            scanner.close();
        }
    }
}
