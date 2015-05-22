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
        if (forValue > 2 && forValue % 2 == 0) {
            List<Integer> result = new ArrayList<>();
            int tmpValue = forValue;
            while (tmpValue % 2 == 0 && tmpValue > 2) {
                result.add(2);
                tmpValue /= 2;
            }
            result.add(tmpValue);
            return result;
        }


        return ImmutableList.of(forValue);
    }
}
