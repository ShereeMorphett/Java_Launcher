package ro.academyplus.avaj.simulator;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Simulator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ro.academyplus.avaj.simulator.Simulator <scenario-file>");
            return;
        }

        try
        {
        String scenarioFile = args[0];
        File file = new File(scenarioFile);
        Scanner scenario_input = new Scanner(file);

        if (!file.exists()) {
            System.out.println("File not found: " + scenarioFile);
            return;
        }
        while (scenario_input.hasNextLine())
        {
            String data = scenario_input.nextLine();
            System.out.println(data);
        }
      scenario_input.close();

            System.out.println("Processing scenario file: " + scenarioFile);
            System.out.println("Processing scenario file: " + file);


        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
