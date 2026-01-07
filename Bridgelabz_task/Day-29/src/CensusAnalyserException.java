package day_29;

public class CensusAnalyserException extends Exception {
    public enum ExceptionType {
        FILE_NOT_FOUND,
        INVALID_FILE_TYPE,
        INVALID_DELIMITER,
        INVALID_HEADER
    }

    public ExceptionType type;

    public CensusAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}

