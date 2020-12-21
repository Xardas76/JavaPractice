package com.company;

public class IncorrectINNException extends Exception{
    @Override
    public String getMessage() {
        return "Неверно введённый ИНН";
    }
}
