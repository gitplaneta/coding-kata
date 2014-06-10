package eu.busz.interview.coding.kata;

import java.util.List;

public class ConcurrentSorter<T extends Comparable<T>> {

    public T[] sort(T[] input) {
        mergeSort(input, 0, input.length);

        return input;
    }

    private void mergeSort(T[] arr, int begin, int end) {
        if (begin >= end) {
            mergeSort(arr, begin, end / 2);
            mergeSort(arr, end / 2 + 1, end);

            merge(arr, begin, end);
        }
    }

    private void merge(T[] arr, int begin, int end) {
        int mid = end / 2;
        int right = begin;
        int left = end / 2 + 1;

        if (arr[left].compareTo(arr[mid]) <= 0) {
            left++;
        } else {
            while (right < mid && left < end) {
                T tmp = arr[mid];

            }
        }
    }

    private <T> void swap(int a, int b, T[] arr) {
        T tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
