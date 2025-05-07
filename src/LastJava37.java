public class LastJava37 {
    public int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        for (int i = 0; i < nums.length; i++) {
            target += nums[i];
            indexes[i] = i;
        }
        return indexes;
    }

}
