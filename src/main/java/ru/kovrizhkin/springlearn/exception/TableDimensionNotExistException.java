package ru.kovrizhkin.springlearn.exception;

public class TableDimensionNotExistException extends RuntimeException{
    private String message;

    public TableDimensionNotExistException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
