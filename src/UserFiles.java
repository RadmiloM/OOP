import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserFiles {

    public void createFile() throws IOException {
        File myFile = new File("example.txt");
        if (myFile.exists()) {
            System.out.println("File already exists");
            return;
        }
        myFile.createNewFile();


    }

    public void writeToFile() throws IOException {
        FileWriter fileWriter = new FileWriter("example.txt");
        fileWriter.write("Java is object oriented programming language very useful for different things");
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        UserFiles file = new UserFiles();
        file.createFile();
        file.writeToFile();
    }
}
