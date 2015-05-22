package eu.busz.kata.prime.factors;

import com.google.common.collect.ImmutableList;

import java.util.Collections;
import java.util.List;

public class PrimeFactorGenerator {

    public static List<Integer> generatePrimeFactors(int forValue) {
        if (forValue == 1) {
            return Collections.emptyList();
        }
        if (forValue > 2 && forValue % 2 == 0) {
            return ImmutableList.of(2, forValue / 2);
        }

        return ImmutableList.of(forValue);
    }
}
