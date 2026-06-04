class Solution {

    static long inversionCount(long arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    static long mergeSort(long[] arr, int low, int high) {
        long count = 0;

        if (low < high) {
            int mid = low + (high - low) / 2;

            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merge(arr, low, mid, high);
        }

        return count;
    }

    static long merge(long[] arr, int low, int mid, int high) {

        ArrayList<Long> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        long count = 0;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {

                count += (mid - left + 1);

                temp.add(arr[right++]);
            }
        }

        while (left <= mid)
            temp.add(arr[left++]);

        while (right <= high)
            temp.add(arr[right++]);

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

        return count;
    }
}