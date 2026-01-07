package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StateCensusAnalyserTest {

    private static final String VALID_CSV_FILE = "IndiaStateCensus.csv";
    private static final String INVALID_FILE_PATH = "WrongPath.csv";
    private static final String INVALID_FILE_TYPE = "IndiaStateCensus.txt";
    private static final String INVALID_DELIMITER_FILE = "IndiaStateCensusWrongDelimiter.csv";
    private static final String INVALID_HEADER_FILE = "IndiaStateCensusWrongHeader.csv";

    @Test
    public void givenValidCSVFile_ShouldReturnCorrectRecordCount() throws CensusAnalyserException {
        StateCensusAnalyser analyser = new StateCensusAnalyser();
        int count = analyser.loadCensusData(VALID_CSV_FILE);
        Assertions.assertEquals(3, count); // UC-1
    }

    @Test
    public void givenInvalidFilePath_ShouldThrowException() {
        StateCensusAnalyser analyser = new StateCensusAnalyser();
        CensusAnalyserException exception = Assertions.assertThrows(
                CensusAnalyserException.class,
                () -> analyser.loadCensusData(INVALID_FILE_PATH));
        Assertions.assertEquals(CensusAnalyserException.ExceptionType.FILE_NOT_FOUND, exception.type); // UC-2
    }

    @Test
    public void givenInvalidFileType_ShouldThrowException() {
        StateCensusAnalyser analyser = new StateCensusAnalyser();
        CensusAnalyserException exception = Assertions.assertThrows(
                CensusAnalyserException.class,
                () -> analyser.loadCensusData(INVALID_FILE_TYPE));
        Assertions.assertEquals(CensusAnalyserException.ExceptionType.INVALID_FILE_TYPE, exception.type); // UC-3
    }

    @Test
    public void givenCSVFileWithWrongDelimiter_ShouldThrowException() {
        StateCensusAnalyser analyser = new StateCensusAnalyser();
        CensusAnalyserException exception = Assertions.assertThrows(
                CensusAnalyserException.class,
                () -> analyser.loadCensusData(INVALID_DELIMITER_FILE));
        Assertions.assertEquals(CensusAnalyserException.ExceptionType.INVALID_DELIMITER, exception.type); // UC-4
    }

    @Test
    public void givenCSVFileWithWrongHeader_ShouldThrowException() {
        StateCensusAnalyser analyser = new StateCensusAnalyser();
        CensusAnalyserException exception = Assertions.assertThrows(
                CensusAnalyserException.class,
                () -> analyser.loadCensusData(INVALID_HEADER_FILE));
        Assertions.assertEquals(CensusAnalyserException.ExceptionType.INVALID_HEADER, exception.type); // UC-5
    }
}
