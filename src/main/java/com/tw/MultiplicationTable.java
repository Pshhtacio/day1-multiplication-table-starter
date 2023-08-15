package com.tw;

public class MultiplicationTable {
    public String buildMultiplicationTable(int start, int end) {
        return null;
    }

    public Boolean isValid(int start, int end) {
        boolean isNumbersValid = isStartNotBiggerThanEnd(start, end);
        if(isNumbersValid){
            return (isInRange(start) && isInRange(end)) ? true : null;
        }
        return null;
    }

    public Boolean isInRange(int number) {
        return !(number < 1 || number > 1000);
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        return null;
    }

    public String generateLine(int start, int row) {
        return null;
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return null;
    }
}
