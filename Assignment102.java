import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment102 {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\nihanth.kalisetti\\IdeaProjects\\untitled\\Assignment_Day_10\\src\\Input.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
