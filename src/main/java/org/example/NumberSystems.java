package org.example;

public class NumberSystems {
    private static final String HEX = "0123456789ABCDEF";

    public static String toBinary(String decimalNumber) {
        int d = Integer.parseInt(decimalNumber);
        String binary = "";
        if (d <= 0) {
            return binary;
        }
        while (d != 0) {
            binary = d % 2 + binary;
            d /= 2;
        }
        return binary;
    }

    public static String toOctal(String decimalNumber) {
        int d = Integer.parseInt(decimalNumber);
        int octalNumber = 0;
        if (d <= 0) {
            return String.valueOf(octalNumber);
        }

        int i = 0;
        while (d != 0) {
            octalNumber = (int) (octalNumber + (d % 8) * Math.pow(10, i++));
            d = d / 8;
        }
        return String.valueOf(octalNumber);
    }

    public static String toHex(String decimalNumber) {
        int d = Integer.parseInt(decimalNumber);
        String hexNumber = "";
        if (d <= 0) {
            return hexNumber;
        }

        while (d != 0) {
            hexNumber = HEX.charAt(d % 16) + hexNumber;
            d = d / 16;
        }
        return hexNumber;
    }

    public static String toDecimal(String number, int n) {
        switch (n) {
            case (1): {
                int decimalNumber = 0;
                if (number == null) {
                    return String.valueOf(decimalNumber);
                }
                for (int i = 0; i < number.length(); i++) {
                    int index = number.length() - 1 - i;
                    int value = Character.getNumericValue(number.charAt(index));
                    decimalNumber += value * Math.pow(2, i);
                }
                return String.valueOf(decimalNumber);
            }
            case (2): {
                int o = Integer.parseInt(number);
                int decimalNumber = 0;
                if (o <= 0) {
                    return String.valueOf(decimalNumber);
                }

                int i = 0;
                while (o != 0) {
                    decimalNumber = (int) (decimalNumber + (o % 10) * Math.pow(8, i++));
                    o = o / 10;
                }
                return String.valueOf(decimalNumber);
            }
            case (3): {
                int decimalNumber = 0;
                if (number == null) {
                    return String.valueOf(decimalNumber);
                }

                for (int i = 0; i < number.length(); i++) {
                    decimalNumber = 16 * decimalNumber + HEX.indexOf(number.charAt(i));
                }
                return String.valueOf(decimalNumber);
            }
        }
        return number;
    }
}


