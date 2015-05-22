package eu.busz.kata.prime.factors;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;

import static eu.busz.kata.prime.factors.PrimeFactorGenerator.generatePrimeFactors;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PrimeFactorTest {

    @Test
    public void forPrimeNumberReturnsTheSameValue() {
        List<Integer> result = generatePrimeFactors(2);
        assertThat("Prime numbers have only one prime factor", result, equalTo(ImmutableList.of(2)));
    }
}