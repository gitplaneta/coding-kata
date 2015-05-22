package eu.busz.kata.prime.factors;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class PrimeFactorGenerator {

    public static List<Integer> generatePrimeFactors(int forValue) {
        List<Integer> result = new ArrayList<>();
        if (forValue < 1) {
            throw new IllegalArgumentException("Argument should be greater than zero");
        }

        if (forValue == 1) {
            result = emptyList();
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
