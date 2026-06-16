class Solution {

    double fractionalKnapsack(int W, Item arr[], int n) {

        Arrays.sort(arr, (a, b) -> Double.compare(
                (double) b.value / b.weight,
                (double) a.value / a.weight));

        double profit = 0.0;

        for (Item item : arr) {

            if (W >= item.weight) {

                profit += item.value;
                W -= item.weight;

            } else {

                profit += ((double) item.value / item.weight) * W;
                break;
            }
        }

        return profit;
    }
}
