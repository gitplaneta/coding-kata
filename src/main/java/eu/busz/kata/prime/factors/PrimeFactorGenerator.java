package eu.busz.kata.prime.factors;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactorGenerator {

    public static List<Integer> generatePrimeFactors(int forValue) {
        if (forValue == 1) {
            return Collections.emptyList();
        }

        return ImmutableList.of(forValue);
    }
}
