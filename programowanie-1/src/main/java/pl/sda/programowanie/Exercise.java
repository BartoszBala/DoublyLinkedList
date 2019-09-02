package pl.sda.programowanie;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

class Exercise {

    boolean isAdult(int age) {
        return age >= 18;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    String arrayToString(int[] array) {
        StringBuilder returnString = new StringBuilder();
        for (int value : array) {
            if (returnString.length() > 0) {
                returnString.append(",");
            }
            returnString.append(value);
        }
        return returnString.toString();
    }

    String arrayToStringForKoks(int[] array) {
        return Arrays.stream(array)
                .mapToObj(Integer::toString)
                .reduce((s, s2) -> s + "," + s2)
                .orElse("");
    }

    String tableBackward(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        ArrayUtils.reverse(copy);
        return arrayToString(copy);
    }

    String arrayToStringDivideBy3(int[] array) {
        StringBuilder returnString = new StringBuilder();
        for (int x : array) {
            if (x % 3 == 0) {
                if (returnString.length() > 0) {
                    returnString.append(",");
                }
                returnString.append(x);
            }
        }
        return returnString.toString();
    }
}
