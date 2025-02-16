package filtering;

import static filtering.TextFileFilter.INPUT_PREFIX;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class TextFileFilterTest {

    @Test
    void readsTextFromInputFile() {
        ArrayList<String> inputText = TextFileFilter.readInputFile();

        assertNotNull(inputText);
        assertFalse(inputText.isEmpty());
    }

    @Test
    void RemovesPrefixFromLinesOfText() {
        ArrayList<String> inputText = TextFileFilter.readInputFile();
        ArrayList<String> filteredText = TextFileFilter.removePrefixFromText(inputText);

        for(String textLine: filteredText) {
            assertFalse(textLine.startsWith(INPUT_PREFIX));
        }
    }

    @Test
    void writesFilteredTextToOutputFile() throws FileNotFoundException {
        ArrayList<String> inputText = TextFileFilter.readInputFile();
        ArrayList<String> filteredText = TextFileFilter.removePrefixFromText(inputText);

        TextFileFilter.writeTextToFile(filteredText);

        final File filteredFile =
                new File("src/main/resources/output.properties");

        Scanner reader = new Scanner(filteredFile);
        ArrayList<String> outputText = new ArrayList<>();
        while (reader.hasNextLine()) {
            outputText.add(reader.nextLine());
        }

        assertEquals(inputText.size(), outputText.size());

        for(String line: outputText) {
            assertFalse(line.startsWith(INPUT_PREFIX));
        }
    }
}