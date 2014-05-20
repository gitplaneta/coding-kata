package eu.busz.kata.forkjoin.mergesort;

import eu.busz.interview.coding.kata.ConcurrentSorter;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Radoslaw Busz <radoslaw.busz at gmail.com>
 */
public class SortingAlgorithmTest {

    @Test
    public void sortsSingleElementCollection() {
        List<Integer> input = toList(5);

        ConcurrentSorter cs = new ConcurrentSorter();
        assertThat("single element collection sort", cs.sort(input), equalTo(toList(5)));
    }

    @Test
    public void sortsEmptyCollection() {
        List<Integer> input = new ArrayList<>(0);
        ConcurrentSorter cs = new ConcurrentSorter();

        assertThat("returns empty collection when sorting empty", cs.sort(input), equalTo(toList()));
    }

    private List<Integer> toList(int... elements) {
        List<Integer> result = new ArrayList<>();
        for (int element : elements) {
            result.add(element);
        }
        return result;
    }
}
