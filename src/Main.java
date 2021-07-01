import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int counter = 0;
        Path emailFile = Path.of("sample.txt");
        String contentOfFile = Files.readString(emailFile);
        for(int i = 0; i < contentOfFile.length()-12; i++)
        {
            if ("@softwire.com".equals(contentOfFile.substring(i, 13))) {counter ++;}
        }
        System.out.println(counter);
    }

}
