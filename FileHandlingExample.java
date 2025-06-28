import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        // File name
        String fileName = "example.txt";

        // Writing to a file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a file handling example in Java.\n");
            writer.write("It demonstrates writing and reading from a file.");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from a file
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("Reading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
