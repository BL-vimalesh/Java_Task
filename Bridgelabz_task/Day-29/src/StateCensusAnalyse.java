package day_29;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class StateCensusAnalyser {
    private List<CSVStateCensus> censusList = new ArrayList<>();

    public int loadCensusData(String filePath) throws CensusAnalyserException {
        try {
            Path path = Paths.get(filePath);

            if (!filePath.endsWith(".csv")) {
                throw new CensusAnalyserException("Invalid file type",
                        CensusAnalyserException.ExceptionType.INVALID_FILE_TYPE);
            }

            List<String> lines = Files.readAllLines(path);
            if (lines.isEmpty()) {
                return 0;
            }

            // ✅ Check header
            String header = lines.get(0);
            if (!header.equals("State,Population,AreaInSqKm,DensityPerSqKm")) {
                throw new CensusAnalyserException("Invalid header",
                        CensusAnalyserException.ExceptionType.INVALID_HEADER);
            }

            // ✅ Process data rows
            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] parts = line.split(",");
                if (parts.length != 4) {
                    throw new CensusAnalyserException("Invalid delimiter",
                            CensusAnalyserException.ExceptionType.INVALID_DELIMITER);
                }

                String state = parts[0];
                int population = Integer.parseInt(parts[1]);
                int area = Integer.parseInt(parts[2]);
                int density = Integer.parseInt(parts[3]);

                censusList.add(new CSVStateCensus(state, population, area, density));
            }

            return censusList.size();

        } catch (IOException e) {
            throw new CensusAnalyserException("File not found",
                    CensusAnalyserException.ExceptionType.FILE_NOT_FOUND);
        }
    }

    // Print using Iterator
    public void printCensusData() {
        Iterator<CSVStateCensus> iterator = censusList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
