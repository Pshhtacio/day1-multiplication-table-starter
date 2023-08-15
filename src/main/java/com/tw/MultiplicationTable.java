package com.tw;

public class MultiplicationTable {
    public String buildMultiplicationTable(int start, int end) {
        boolean isNumbersValid = isValid(start, end);
        if(isNumbersValid) {
            return generateTable(start, end);
        }
        return null;
    }

    public Boolean isValid(int start, int end) {
        boolean isNumbersValid = isStartNotBiggerThanEnd(start, end);
        if (isNumbersValid) {
            return (isInRange(start) && isInRange(end)) ? true : false;
        }
        return false;
    }

    public Boolean isInRange(int number) {
        return !(number < 1 || number > 1000);
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        StringBuilder line = new StringBuilder();
        for (int row = start; row <= end; row++) {
            line.append(generateLine(start, row)).append(System.lineSeparator());
        }
        return line.toString().trim();
    }

    public String generateLine(int start, int row) {
        StringBuilder line = new StringBuilder();
        for (int i = start; i <= row; i++) {
            line.append(" " + generateSingleExpression(i, row) + " ");
        }
        return line.toString().trim();
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return (multiplicand + "*" + multiplier + "=" + (multiplicand * multiplier)).toString();
    }
}
