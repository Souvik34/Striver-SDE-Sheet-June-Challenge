class Solution {
    int[] findTwoElement(int arr[]) {
        int n = arr.length;

        long actualSum = 0;
        long actualSqSum = 0;

        for (int num : arr) {
            actualSum += num;
            actualSqSum += (long) num * num;
        }

        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSqSum = (long) n * (n + 1) * (2 * n + 1) / 6;

        long diff = actualSum - expectedSum; // x - y

        long sqDiff = actualSqSum - expectedSqSum; // x² - y²

        long sumXY = sqDiff / diff; // x + y

        int repeating = (int) ((diff + sumXY) / 2);
        int missing = (int) (sumXY - repeating);

        return new int[]{repeating, missing};
    }
}