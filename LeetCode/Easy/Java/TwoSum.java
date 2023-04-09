class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create one loop that allows one number to loop through all other numbers
        //create second loop that allows the first loop to loop through all other numbers
        //if two numbers equal target, then return the two numbers and kick out of loop

        int [] arr2 = {0};
        for(int i = 0; i < nums.length; i++) {
            for (int k = i+1; k < nums.length; k++) {
                if ((nums[i] + nums[k]) == target) {
                    int[] arr = {i,k};
                    return arr;
                }
            }
        }

        return arr2;
    }
}
