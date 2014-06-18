package eu.busz.interview.coding.kata;

public class ConcurrentSorter {

    public int[] sort(int[] input) {
        mergeSort(input, 0, input.length-1);
        return input;
    }

    private void mergeSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int mid = begin + (end - begin) / 2;
            mergeSort(arr, begin, mid);
            mergeSort(arr, mid+1, end);

            merge(arr, begin, mid, end);
        }
    }

    private void merge(int[] arr, int begin, int mid, int end) {
        int[] tmp = new int[end - begin + 1];
        int left = begin;
        int right = mid + 1;

        int curr = 0;
        while (left <= mid || right <= end) {
            boolean rightInBoudary = right <= end;
            boolean leftInBoundary = left <= mid;
            int assignVal;

            if (leftInBoundary && !rightInBoudary) {
                assignVal = arr[left++];
            } else if (rightInBoudary && !leftInBoundary) {
                assignVal = arr[right++];
            } else if (arr[right] > arr[left]) {
                assignVal = arr[left++];
            } else {
                assignVal = arr[right++];
            }
            tmp[curr++] = assignVal;
        }
        for (int i = begin; i <= end; i++) {
            arr[i] = tmp[i-begin];
        }
    }

    private <T> void swap(int a, int b, T[] arr) {
        T tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
