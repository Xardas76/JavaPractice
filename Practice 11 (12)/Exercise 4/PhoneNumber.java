package com.company;

public class PhoneNumber {
    private String number;

    public PhoneNumber(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException();
        }
        switch (str.charAt(0)) {
            case '+':
                if (str.length() < 12)
                    throw new IllegalArgumentException();
                number = str;
                break;
            case '8':
                if (str.length() != 11)
                    throw new IllegalArgumentException();
                number = "+7" + str.substring(1);
                break;
            default:
                throw new IllegalArgumentException();
        }

    }

    @Override
    public String toString() {
        int len = number.length();
        return number.substring(0, len - 10) + ' ' +
                number.substring( len - 10, len-7) + '-' +
                number.substring( len - 7, len-4) + '-' +
                number.substring( len - 4, len) ;
    }
}
