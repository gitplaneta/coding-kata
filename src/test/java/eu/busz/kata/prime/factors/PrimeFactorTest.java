package eu.busz.kata.prime.factors;

import com.google.common.collect.ImmutableList;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static eu.busz.kata.prime.factors.PrimeFactorGenerator.generatePrimeFactors;
import static java.util.Collections.emptyList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

public class PrimeFactorTest {

    @Test
    public void forPrimeNumberReturnsTheSameValue() {
        List<Integer> result = generatePrimeFactors(2);
        assertThat("Prime numbers have only one prime factor", result, equalTo(ImmutableList.of(2)));
    }

    @Test
    public void valueOfOneHasNoPrimeFactors() {
        assertThat("One has no prime factors", generatePrimeFactors(1), equalTo(emptyList()));
    }

    @Test
    public void forEvenNumbersLargerThanTwoReturnsAtLeastTwoValues() {
        assertThat("Event numbers have at least two prime factors", generatePrimeFactors(10).size(), greaterThan(1));
    }

    @Test
    public void forPowersOfTwoReturnsAllPrimeFactors() {
        assertThat("Power of two's yield correct result", generatePrimeFactors(32),
                equalTo(ImmutableList.of(2,2,2,2,2)));
        assertThat("Power of two's yield correct result", generatePrimeFactors(256),
                equalTo(ImmutableList.of(2,2,2,2,2,2,2,2)));
    }

    @Test
    public void correctlyReturnsPrimeFactorsForAllNumbers() {
        assertThat(generatePrimeFactors(27), equalTo(ImmutableList.of(3,3,3)));
        assertThat(generatePrimeFactors(77), equalTo(ImmutableList.of(7, 11)));
    }
}
