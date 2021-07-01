import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        int counter = 0;
        Path emailFile = Path.of("sample.txt");
        String contentOfFile = Files.readString(emailFile);
        HashMap<String, Integer> adresses = new HashMap<>();

        String patternString = "@(.+?)[ \n]";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(contentOfFile);
        while (matcher.find()) {
            if (adresses.containsKey(matcher.group(1))) {
                adresses.put(matcher.group(1), adresses.get(matcher.group(1)) + 1);
            } else {
                adresses.put(matcher.group(1), 1);
            }
        }
        adresses.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
    }

}
