import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    private StringBuilder builder = null;
    private Scanner scan = null;

    public FileReader(String filename) throws FileNotFoundException {
        scan = new Scanner(new File(filename));
        builder = new StringBuilder();
    }

    public String read(){
        while(scan.hasNext()){
            builder.append(scan.next());
        }
        return builder.toString();
    }
}
