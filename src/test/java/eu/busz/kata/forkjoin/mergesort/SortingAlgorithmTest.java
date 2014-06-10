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
        Integer[] input = toArray(5);

        ConcurrentSorter cs = new ConcurrentSorter();
        assertThat("single element collection sort", cs.sort(input), equalTo(toArray(5)));
    }

    @Test
    public void sortsEmptyCollection() {
        Integer[] input = new Integer[0];
        ConcurrentSorter cs = new ConcurrentSorter();

        assertThat("returns empty collection when sorting empty", cs.sort(input), equalTo(toArray()));
    }

    @Test
    public void sortsFiveElementList() {
        Integer[] input = toArray(5,11,-1,0,0);
        ConcurrentSorter cs = new ConcurrentSorter();

        assertThat("retuns sorted list", cs.sort(input), equalTo(toArray(-1,0,0,5,11)));
    }

    private Integer[] toArray(Integer... elements) {
//        List<Integer> result = new ArrayList<>();
//        for (int element : elements) {
//            result.add(element);
//        }
        return elements;
    }
}
