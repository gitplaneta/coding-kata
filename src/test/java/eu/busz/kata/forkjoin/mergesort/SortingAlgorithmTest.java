package eu.busz.kata.forkjoin.mergesort;

import eu.busz.interview.coding.kata.ConcurrentSorter;
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
        int[] input = toArray(5);

        ConcurrentSorter cs = new ConcurrentSorter();
        assertThat("single element collection sort", cs.sort(input), equalTo(toArray(5)));
    }

    @Test
    public void sortsEmptyCollection() {
        int[] input = new int[0];
        ConcurrentSorter cs = new ConcurrentSorter();

        assertThat("returns empty collection when sorting empty", cs.sort(input), equalTo(toArray()));
    }

    @Test
    public void sortsFiveElementList() {
        int[] input = toArray(5,11,-1,1000,0);
        ConcurrentSorter cs = new ConcurrentSorter();

        assertThat("retuns sorted list", cs.sort(input), equalTo(toArray(-1,0,5,11,1000)));
    }

    @Test
    public void sortsSixRandomElementList() {
        int[] input = toArray(5,33,100,3,-220, 0, 4444, -50, 10000,1,1,1);
        ConcurrentSorter cs = new ConcurrentSorter();

        assertThat("returns sorted array", cs.sort(input), equalTo(toArray(-220, -50, 0, 1,1,1, 3, 5,33,100,4444,10000)));
    }

    private int[] toArray(int... elements) {
        return elements;
    }
}
