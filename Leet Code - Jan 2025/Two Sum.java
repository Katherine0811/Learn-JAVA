class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if ((target == nums[i] + nums[j]) && (i != j)) {
                    solution[0] = i;
                    solution[1] = j;
                }
            }
        }
        return solution;
    }
}