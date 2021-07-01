import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) throws IOException {
        int counter = 0;
        Path emailFile = Path.of("sample.txt");
        String contentOfFile = Files.readString(emailFile);
        String patternString = "@softwire.com";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(contentOfFile);
        while(matcher.find()) {
            counter++;
        }
        System.out.println(counter);
    }

}
