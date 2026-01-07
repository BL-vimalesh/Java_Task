package day_29;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StateCensusAnalysers {
    private List<CSVStateCensus> censusList = new ArrayList<>();

    public int loadCensusData(String filePath) throws CensusAnalysersException {
        try {
            if (!filePath.endsWith(".csv")) {
                throw new CensusAnalysersException("Invalid file type",
                        CensusAnalysersException.ExceptionType.INVALID_FILE_TYPE);
            }

            CSVReader reader = new CSVReader(new FileReader(filePath));
            String[] nextLine;
            boolean skipHeader = true;

            while ((nextLine = reader.readNext()) != null) {
                if (skipHeader) {
                    // ✅ Check header correctness
                    if (!(nextLine[0].equals("State") &&
                          nextLine[1].equals("Population") &&
                          nextLine[2].equals("AreaInSqKm") &&
                          nextLine[3].equals("DensityPerSqKm"))) {
                        throw new CensusAnalysersException("Invalid header",
                                CensusAnalysersException.ExceptionType.INVALID_HEADER);
                    }
                    skipHeader = false;
                    continue;
                }


                if (nextLine.length != 4) {
                    throw new CensusAnalyserException("Invalid delimiter",
                            CensusAnalyserException.ExceptionType.INVALID_DELIMITER);
                }

                String state = nextLine[0];
                int population = Integer.parseInt(nextLine[1]);
                int area = Integer.parseInt(nextLine[2]);
                int density = Integer.parseInt(nextLine[3]);

                censusList.add(new CSVStateCensus(state, population, area, density));
            }
            return censusList.size();

        } catch (IOException e) {
            throw new CensusAnalyserException("File not found",
                    CensusAnalyserException.ExceptionType.FILE_NOT_FOUND);
        }
    }
}

