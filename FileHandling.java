package Phase1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
     
        String filePath = "file.txt";

        // Write to a file
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("First line of the file.");
            bufferedWriter.newLine(); 
            bufferedWriter.write("Second line of the file.");
            bufferedWriter.close();
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from the file
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            System.out.println("Contents of the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Append to the file
        try {
            FileWriter fileWriter = new FileWriter(filePath, true); 
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Appended line.");
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("Data appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


