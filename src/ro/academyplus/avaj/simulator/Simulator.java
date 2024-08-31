package ro.academyplus.avaj.simulator;

import java.io.File;
import java.io.IOException;

public class Simulator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ro.academyplus.avaj.simulator.Simulator <scenario-file>");
            return;
        }

        String scenarioFile = args[0];
        File file = new File(scenarioFile);

        if (!file.exists()) {
            System.out.println("File not found: " + scenarioFile);
            return;
        }

        // try {
            // Your logic to process the scenario file
            System.out.println("Processing scenario file: " + scenarioFile);
        // } catch (IOException e) {
        //     System.err.println("An error occurred while reading the file: " + e.getMessage());
        //     e.printStackTrace();
        // }
    }
}
