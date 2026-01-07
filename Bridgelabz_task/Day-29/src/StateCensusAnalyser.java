package day_29;


import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StateCensusAnalyser {
	public class CSVStateCensus {
		private String state;
		private int population;
		private int areaInSqKm;
		private int densityPerSqKm;


		public CSVStateCensus(String state, int population, int areaInSqKm, int densityPerSqKm) {
			this.state = state;
			this.population = population;
			this.areaInSqKm = areaInSqKm;
			this.densityPerSqKm = densityPerSqKm;
		}

		@Override
		public String toString() {
			return "State: " + state + ", Population: " + population + ", Area: " + areaInSqKm + ", Density: "
					+ densityPerSqKm;
		}
	}

	private List<CSVStateCensus> censusList = new ArrayList<>();


	public void loadCensusData(String filePath) {
		try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
			String[] nextLine;
			boolean skipHeader = true;

			while ((nextLine = reader.readNext()) != null) {
				if (skipHeader) { 
					skipHeader = false;
					continue;
				}
				String state = nextLine[0];
				int population = Integer.parseInt(nextLine[1]);
				int area = Integer.parseInt(nextLine[2]);
				int density = Integer.parseInt(nextLine[3]);

				CSVStateCensus census = new CSVStateCensus(state, population, area, density);
				censusList.add(census);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public void printCensusData() {
		Iterator<CSVStateCensus> iterator = censusList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}


	public int getRecordCount() {
		return censusList.size();
	}

	public static void main(String[] args) {
		StateCensusAnalyser analyser = new StateCensusAnalyser();
		analyser.loadCensusData("IndiaStateCensus.csv");

		System.out.println("Total Records Loaded: " + analyser.getRecordCount());
		System.out.println("Printing Census Data:");
		analyser.printCensusData();
	}
}
