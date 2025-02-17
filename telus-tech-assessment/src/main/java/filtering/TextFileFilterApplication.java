package filtering;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TextFileFilterApplication {
    static final String INPUT_PREFIX = "prefix.";
    static final File INPUT_FILE = new File("src/main/resources/input.properties");
    static final File OUTPUT_FILE = new File("src/main/resources/output.properties");



    public static void main(String[] args) {
        List<String> inputText = readInputFile();
        List<String> filteredText = removePrefixFromText(inputText);
        writeTextToFile(filteredText);
    }

    static List<String> readInputFile() {
        ArrayList<String> inputDataToReturn = new ArrayList<>();

        try (Scanner reader = new Scanner(INPUT_FILE)) {
            while (reader.hasNextLine()) {
                inputDataToReturn.add(reader.nextLine());
            }
        } catch(FileNotFoundException e){
            System.out.println("ERROR: Input file not found.");
            e.printStackTrace();
        }

        return inputDataToReturn;
    }

    static List<String> removePrefixFromText(List<String> inputText) {
        return inputText.stream()
                .map(textLine -> textLine.replace(INPUT_PREFIX, ""))
                .collect(Collectors.toList());
    }

    static void writeTextToFile(List<String> filteredText) {
        try (FileWriter writer = new FileWriter(OUTPUT_FILE)) {
            for(String line: filteredText) {
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("ERROR: An error occurred whilst writing to output file: "
                + OUTPUT_FILE);
            e.printStackTrace();
        }
    }
}
