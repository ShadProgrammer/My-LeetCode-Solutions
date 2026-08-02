class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
            // else if (nums[i] < min){
            //     min = nums[i];
            // }
        }

        int low = 1; int high = max; int ans = -1;
        
        while (low <= high){
            int mid = (low+high)/2;
            int sum = 0;

            for (int i = 0; i < nums.length; i++){
                sum += Math.ceil((float)nums[i]/mid);
            }
            System.out.println(sum);
            if (sum <= threshold){
                ans = mid;
                high = mid-1;
            }
            else if (sum > threshold){
                low = mid+1;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna