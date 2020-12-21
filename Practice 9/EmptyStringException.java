package com.company;

public class EmptyStringException extends Exception{
    @Override
    public String getMessage() {
        return "Получена пустая строка";
    }
}
