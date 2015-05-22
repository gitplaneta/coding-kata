package eu.busz.kata.prime.factors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactorGenerator {

    public static List<Integer> generatePrimeFactors(int forValue) {
        List<Integer> result = new ArrayList<>();
        if (forValue < 1) {
            throw new IllegalArgumentException("Argument should be greater than zero");
        }

        if (forValue == 1) {
            result = Collections.emptyList();
        } else {
            for (int i = 2; i <= forValue; i++) {
                if (forValue % i == 0) {
                    result.add(i);
                    result.addAll(generatePrimeFactors(forValue / i));
                    break;
                }
            }
        }

        return result;
    }
}
