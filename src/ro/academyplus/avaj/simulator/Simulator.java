package ro.academyplus.avaj.simulator;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import ro.academyplus.avaj.AircraftFactory;

/*
	private static void loadAircrafts() throws SimulationException {
		try {
			String info[];
			tower = new WeatherTower();
			while ((currentLine = br.readLine()) != null) {
				info = currentLine.split("\\s+");
				AircraftFactory.newAircraft(info[0], info[1], Integer.parseInt(info[2]),
					Integer.parseInt(info[3]), Integer.parseInt(info[4])).registerTower(tower);
			}
			br.close();
		} catch (IOException e) {
			throw new SimulationException(e);
		}
	}
	}
}*/
public class Simulator {
    
    private static int cyclesCount;
	private static BufferedReader br;
	private static String data;
    private static WeatherTower tower;
    
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ro.academyplus.avaj.simulator.Simulator <scenario-file>");
            return;
        }

        try
        {
            //would be in an init/load aircrafts, ini cycleCount
            String scenarioFile = args[0];
            File file = new File(scenarioFile);
            Scanner scenario_input = new Scanner(file);

            if (!file.exists()) {
                System.out.println("File not found: " + scenarioFile);
                return;
            }
            while (scenario_input.hasNextLine())
            {
                data = scenario_input.nextLine();
                System.out.println(data);
            }
            
            scenario_input.close();
            System.out.println("Processing scenario file: " + scenarioFile);
            System.out.println("Processing scenario file: " + file);

        }
        catch (IOException e)
        {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
