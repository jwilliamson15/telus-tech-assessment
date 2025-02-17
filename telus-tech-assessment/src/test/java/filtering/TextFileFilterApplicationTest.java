package filtering;

import static filtering.TextFileFilterApplication.INPUT_PREFIX;
import static filtering.TextFileFilterApplication.OUTPUT_FILE;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TextFileFilterApplicationTest {

    @Test
    void readsTextFromInputFile() {
        List<String> inputText = TextFileFilterApplication.readInputFile();

        assertNotNull(inputText);
        assertFalse(inputText.isEmpty());
    }

    @Test
    void RemovesPrefixFromLinesOfText() {
        List<String> inputText = TextFileFilterApplication.readInputFile();
        List<String> filteredText = TextFileFilterApplication.removePrefixFromText(inputText);

        for(String textLine: filteredText) {
            assertFalse(textLine.startsWith(INPUT_PREFIX));
        }
    }

    @Test
    void writesFilteredTextToOutputFile() throws FileNotFoundException {
        List<String> inputText = TextFileFilterApplication.readInputFile();
        List<String> filteredText = TextFileFilterApplication.removePrefixFromText(inputText);

        TextFileFilterApplication.writeTextToFile(filteredText);

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

    @Test
    void testsMainMethodRunsWithoutError() throws FileNotFoundException {
        TextFileFilterApplication.main(new String[]{});

        List<String> result = new ArrayList<>();
        try (Scanner reader = new Scanner(OUTPUT_FILE)) {
            while (reader.hasNextLine()) {
                result.add(reader.nextLine());
            }
        }

        assertEquals(3, result.size());
        assertEquals("test.cfg.root=/test/cfg", result.get(0));
    }
}