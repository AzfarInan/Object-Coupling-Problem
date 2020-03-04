import java.io.FileNotFoundException;

public class DataReaderClient {
    private FileReader fileReader = null;
    private String filename = "res/myfile.txt";

    public DataReaderClient() throws FileNotFoundException {
        fileReader = new FileReader(filename);
    }

    private String fetchData(){
        return fileReader.read();
    }

    public static void main(String args[]) throws FileNotFoundException {
        DataReaderClient dataReader = new DataReaderClient();
        System.out.println("Got Data: " + dataReader.fetchData());
    }
}
