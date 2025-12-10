class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int j = (i+k)%nums.length;
            arr[j]=nums[i];
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=arr[i];
        }
    }
}