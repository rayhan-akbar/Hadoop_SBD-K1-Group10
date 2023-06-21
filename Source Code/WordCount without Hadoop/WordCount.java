import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String inputFile = "text500MB.txt"; // Path to the input file
        try {
            Map<String, Integer> wordCountMap = countWords(inputFile);
            // Print the word count results
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.err.println("Error reading the input file: " + e.getMessage());
        }

    }
    public static Map<String, Integer> countWords(String inputFile) throws IOException {
        Map<String, Integer> wordCountMap = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line;
        // Read each line from the input file
        while ((line = reader.readLine()) != null) {
            // Split the line into words using whitespace as the delimiter
            String[] words = line.split("\\s+");
            // Count the occurrences of each word
            for (String word : words) {
                if (wordCountMap.containsKey(word)) {
                    // Increment the count if the word is already present
                    wordCountMap.put(word, wordCountMap.get(word) + 1);
                } else {
                    // Initialize the count to 1 for new words
                    wordCountMap.put(word, 1);
                }
            }
        }
        reader.close();
        return wordCountMap;
    }
}
