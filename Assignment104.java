import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment104 {
    public static void main(String[] args) {
        String[] sourceFiles = {"C:\\Users\\nihanth.kalisetti\\IdeaProjects\\untitled\\Assignment_Day_10\\src\\File1.txt", "C:\\Users\\nihanth.kalisetti\\IdeaProjects\\untitled\\Assignment_Day_10\\src\\File2.txt", "C:\\Users\\nihanth.kalisetti\\IdeaProjects\\untitled\\Assignment_Day_10\\src\\File3.txt"};
        String destinationFile = "C:\\Users\\nihanth.kalisetti\\IdeaProjects\\untitled\\Assignment_Day_10\\src\\Merged.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFile))) {
            for (String sourceFile : sourceFiles) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile))) {
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        bufferedWriter.write(line);
                        bufferedWriter.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("An error occurred while reading " + sourceFile + ": " + e.getMessage());
                }
            }
            System.out.println("Files merged successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to " + destinationFile + ": " + e.getMessage());
        }
    }
}
