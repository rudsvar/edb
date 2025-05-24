package no.noria.edb.kattis;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class KattisTest {

    record InputOutput(String input, String output) {
    }

    private List<InputOutput> fetchTestInputsAndOutputs() {

    }

    @Test
    void testPrograms() throws IOException {
        // List java files
        List<Path> programs = Files.walk(Path.of("src/main/java/no/noria/edb/kattis"))
                .filter(p -> p.toString().endsWith(".java"))
                .toList();
        for (Path p : programs) {
            // Fetch inputs and outputs for each, with cache
            System.out.println(p);
        }
    }
}
