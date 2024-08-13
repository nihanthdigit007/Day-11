import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Assignment101 {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\nihanth.kalisetti\\IdeaProjects\\untitled\\Assignment_Day_10\\src\\Source.txt";
        String destinationFile = "C:\\Users\\nihanth.kalisetti\\IdeaProjects\\untitled\\Assignment_Day_10\\src\\Destination.txt";

        try (FileReader fileReader = new FileReader(sourceFile);
             FileWriter fileWriter = new FileWriter(destinationFile)) {
            int character;

            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            System.out.println("File content copied successfully!");
            } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
