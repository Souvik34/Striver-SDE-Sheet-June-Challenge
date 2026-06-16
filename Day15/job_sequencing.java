class Solution {

    int[] JobScheduling(Job arr[], int n) {

        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;

        for (Job job : arr) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        int[] slots = new int[maxDeadline + 1];
        Arrays.fill(slots, -1);

        int countJobs = 0;
        int totalProfit = 0;

        for (Job job : arr) {

            for (int j = job.deadline; j > 0; j--) {

                if (slots[j] == -1) {

                    slots[j] = job.id;
                    countJobs++;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        return new int[] { countJobs, totalProfit };
    }
}